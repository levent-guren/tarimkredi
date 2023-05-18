package tr.org.tarimkredi.service;

import java.security.Key;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class SecurityService {
	private static final String KEY = "njynUuCg4krY7dDBfSNzjlONN5H08b25ZdZatCdTwrKmlaAZOr4zYjegyYpzFfYH04/nqlhy1WW66nFVj3yHMA==";

	public Claims tokenCheck(String token) {
		JwtParser parser = Jwts.parserBuilder().setSigningKey(getKey()).build();
		return parser.parseClaimsJws(token).getBody();
	}

	public static Key getKey() {
		Key key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(KEY));
		return key;
	}

}
