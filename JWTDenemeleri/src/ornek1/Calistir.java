package ornek1;

import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;

public class Calistir {
	private static final String KEY = "njynUuCg4krY7dDBfSNzjlONN5H08b25ZdZatCdTwrKmlaAZOr4zYjegyYpzFfYH04/nqlhy1WW66nFVj3yHMA==";
	private static final String JSON_TEST = "eyJhbGciOiJIUzUxMiJ9.eyJhZGkiOiJMZXZlbnQiLCJzb3lhZGkiOiJHw5xSRU4iLCJzdWIiOiJsb2dpbiIsImV4cCI6MTY4NDM5NjYxNiwiYXVkIjoiTGV2ZW50IiwianRpIjoiMTIzNCJ9.TonSxqyloD1Nv4MZgO2UYbJilbhpKNdcERAF_WkfxS0d4Y9Fj-LNs8Fz2SL8RqTAwpxB-W-9FLC947c_3aNnFg";

	public static void main(String[] args) {
//		keyUret();
//		createJSON();
		jsonTest();
	}

	public static void jsonTest() {
		JwtParser builder = Jwts.parserBuilder().setSigningKey(getKey()).build();
		Claims body = builder.parseClaimsJws(JSON_TEST).getBody();
		System.out.println(body.getId());
		System.out.println(body.getAudience());
		System.out.println(body.getSubject());
		System.out.println(body.get("adi"));
		System.out.println(body.get("soyadi"));
	}

	public static void createJSON() {
		Instant tarih = Instant.now().plus(15, ChronoUnit.MINUTES);
		JwtBuilder jwtBuilder = Jwts.builder();

		// add custom keys
		Map<String, Object> customKeys = new HashMap<>();
		customKeys.put("adi", "Levent");
		customKeys.put("soyadi", "GÜREN");
		jwtBuilder = jwtBuilder.addClaims(customKeys);

		jwtBuilder = jwtBuilder.setSubject("login").setExpiration(Date.from(tarih));
		jwtBuilder = jwtBuilder.setAudience("Levent").setId("1234");

		String json = jwtBuilder.signWith(getKey()).compact();
		System.out.println(json);
	}

	public static void keyUret() {
		Key key = Keys.secretKeyFor(SignatureAlgorithm.HS512);
		String str = Encoders.BASE64.encode(key.getEncoded());
		System.out.println(str);
	}

	public static Key getKey() {
		Key key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(KEY));
		return key;
	}
}
