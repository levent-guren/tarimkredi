package tr.org.tarimkredi.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tr.org.tarimkredi.service.SecurityService;

@Service
public class JWTFilter extends OncePerRequestFilter {
	@Autowired
	private SecurityService securityService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		try {
			String authHeader = request.getHeader("Authorization");
			if (authHeader != null) {
				if (authHeader.startsWith("Bearer ")) {
					String token = authHeader.substring(7);
					Claims claims = securityService.tokenCheck(token);
					String email = claims.getId();
					@SuppressWarnings("unchecked")
					ArrayList<String> roles = (ArrayList<String>) claims.get("roles");
					List<GrantedAuthority> authorities = roles.stream().map(s -> new SimpleGrantedAuthority("ROLE_" + s)).collect(Collectors.toList());
					UserDetails user = new User(email, "", authorities);

					UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(user, "", user.getAuthorities());
					usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
					SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		filterChain.doFilter(request, response);
	}

}
