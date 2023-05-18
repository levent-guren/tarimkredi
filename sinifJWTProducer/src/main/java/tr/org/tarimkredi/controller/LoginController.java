package tr.org.tarimkredi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tr.org.tarimkredi.dto.AuthDTO;
import tr.org.tarimkredi.dto.JsonDTO;
import tr.org.tarimkredi.service.UserService;

@RestController
public class LoginController {
	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public ResponseEntity<JsonDTO> login(@RequestBody AuthDTO authDTO) {
		String token = userService.login(authDTO.getEmail(), authDTO.getPassword());
		if (token == null) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		JsonDTO result = new JsonDTO();
		result.setToken(token);
		return ResponseEntity.ok(result);

	}
}
