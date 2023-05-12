package tr.org.tarimkredi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import tr.org.tarimkredi.entity.Personel;
import tr.org.tarimkredi.service.PersonelService;

@RestController
public class PersonelController {
	@Autowired
	private PersonelService personelService;

	@GetMapping("/personel")
	public List<Personel> getTumPersoneller() {
		return personelService.getTumPersoneller();
	}

	@DeleteMapping("/personel")
	@Transactional
	public String personelSil(String eposta) {
		personelService.personelSil(eposta);
		return "Silme Başarılı";
	}

	@PostMapping("/personel")
	@Transactional
	public Personel personelGuncelle(@RequestBody Personel personel) {
		return personelService.personelGuncelle(personel);
	}

}
