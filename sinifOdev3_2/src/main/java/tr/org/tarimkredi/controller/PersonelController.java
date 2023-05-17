package tr.org.tarimkredi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.org.tarimkredi.dto.PersonelDTO;
import tr.org.tarimkredi.dto.PersonelSonucDTO;
import tr.org.tarimkredi.feign.PersonelFeign;

@RestController
public class PersonelController {
	@Autowired
	private PersonelFeign personelFeign;

	@GetMapping("/")
	public PersonelSonucDTO getPersonelSonuc(String bolumAdi) {
		List<PersonelDTO> personeller = personelFeign.getPersoneller();
		long personelSayisi = personelFeign.getPersonelSayisi(bolumAdi);

		PersonelSonucDTO sonuc = new PersonelSonucDTO();
		sonuc.setPersoneller(personeller);
		sonuc.setPersonelSayisi(personelSayisi);

		return sonuc;
	}
}
