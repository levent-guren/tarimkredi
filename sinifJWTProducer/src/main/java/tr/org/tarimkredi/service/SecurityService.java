package tr.org.tarimkredi.service;

import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import tr.org.tarimkredi.entity.User;

@Service
public class SecurityService {
	private static final String KEY = "njynUuCg4krY7dDBfSNzjlONN5H08b25ZdZatCdTwrKmlaAZOr4zYjegyYpzFfYH04/nqlhy1WW66nFVj3yHMA==";

	public String createToken(User user) {
		Instant tarih = Instant.now().plus(15, ChronoUnit.MINUTES);
		JwtBuilder jwtBuilder = Jwts.builder();

		List<String> roleNames = user.getUserRoles().stream().map(ur -> ur.getRole().getName()).collect(Collectors.toList());

		// add custom keys
		Map<String, Object> customKeys = new HashMap<>();
		customKeys.put("roles", roleNames);
		jwtBuilder = jwtBuilder.addClaims(customKeys);

		jwtBuilder = jwtBuilder.setSubject("tarimkredi").setExpiration(Date.from(tarih));
		jwtBuilder = jwtBuilder.setAudience(user.getName()).setId(user.getEmail());

		String json = jwtBuilder.signWith(getKey()).compact();
		return json;
	}

	public static Key getKey() {
		Key key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(KEY));
		return key;
	}

}
