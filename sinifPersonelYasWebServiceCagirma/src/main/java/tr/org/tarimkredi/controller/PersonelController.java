package tr.org.tarimkredi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.org.tarimkredi.dto.PersonelDTO;
import tr.org.tarimkredi.feign.PersonelFeign;

@RestController
public class PersonelController {
	@Autowired
	private PersonelFeign personelFeign;

	@GetMapping("/personel")
	public List<PersonelDTO> getPersoneller(int yas) {
		return personelFeign.getPersonellerByYas(yas);
	}
}
