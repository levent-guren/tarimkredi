package tr.org.tarimkredi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class IlkController {
	@GetMapping({ "", "/" })
	public String merhaba() {
		System.out.println("Merhaba");
		return "Merhaba";
	}

	@GetMapping("/test")
	public String test(String adi) {
		return "Merhaba " + adi;
	}

	@GetMapping("/test2")
	public String test5(String adi, String yas) {
		return "Merhaba " + adi + " " + yas;
	}

}
