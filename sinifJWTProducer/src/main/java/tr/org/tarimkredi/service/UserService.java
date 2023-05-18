package tr.org.tarimkredi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import tr.org.tarimkredi.entity.User;
import tr.org.tarimkredi.repository.UserRepository;

@Service
public class UserService implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private SecurityService securityService;

	public String login(String email, CharSequence password) {
		Optional<User> userO = userRepository.findById(email);
		if (userO.isPresent()) {
			// user found, check password
			User user = userO.get();
			if (passwordEncoder.matches(password, user.getPassword())) {
				// password correct, create token
				return securityService.createToken(user);
			}
		}
		return null;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("levent encoded: " + passwordEncoder.encode("levent"));
		// $2a$10$s.gKJlG0UXvGhqxmsP0dCOSnC5mB65yO07D2rq0ueUWWNpQgjRAAi
		// $2a$10$j1e8NHDwUXfSLr9EGGySm.cjFVQUbCSj4pdVgksiHlP7uZan1QOsS
		System.out.println(passwordEncoder.matches("levent", "$2a$10$s.gKJlG0UXvGhqxmsP0dCOSnC5mB65yO07D2rq0ueUWWNpQgjRAAi"));
		System.out.println(passwordEncoder.matches("levent", "$2a$10$j1e8NHDwUXfSLr9EGGySm.cjFVQUbCSj4pdVgksiHlP7uZan1QOsS"));
		System.out.println("arif encoded: " + passwordEncoder.encode("arif"));
		System.out.println("gozde encoded: " + passwordEncoder.encode("gozde"));
		System.out.println("serdar encoded: " + passwordEncoder.encode("serdar"));
		System.out.println("ahmet encoded: " + passwordEncoder.encode("ahmet"));

	}

}
