package tr.gov.tarimkredi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.gov.tarimkredi.entity.Personel;
import tr.gov.tarimkredi.service.PersonelService;

@RestController
public class PersonelController {
	@Autowired
	private PersonelService personelService;

	@GetMapping("/")
	public List<Personel> getAllPersonels() {
		return personelService.getAllPersonels();
	}
}
