package tr.org.tarimkredi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.org.tarimkredi.beans.Personel;
import tr.org.tarimkredi.repository.PersonelRepository;

@RestController
public class PersonelController {
	@Autowired
	private PersonelRepository personelRepository;

	@GetMapping("/liste")
	public List<Personel> getPersoneller() {
		return personelRepository.findAll();
	}
}
