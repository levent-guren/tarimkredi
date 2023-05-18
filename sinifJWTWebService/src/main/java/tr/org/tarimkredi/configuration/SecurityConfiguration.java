package tr.org.tarimkredi.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import tr.org.tarimkredi.filter.JWTFilter;

@Configuration
public class SecurityConfiguration {
	@Autowired
	private JWTFilter jwtFilter;

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		// @formatter:off
		http.cors().and().csrf().disable()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
		.authorizeHttpRequests((authz) -> 
					authz
					.requestMatchers("/personelSayisi").permitAll()
					.requestMatchers("/personeller").hasAnyRole("ANALIST", "MUDUR")
					.requestMatchers("/bolumler").hasAnyRole("UZMAN", "MUDUR")
					.anyRequest().authenticated());
		// @formatter:on
		http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
		return http.build();
	}

}
