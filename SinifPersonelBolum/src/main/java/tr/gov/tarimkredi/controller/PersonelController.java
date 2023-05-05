package tr.gov.tarimkredi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.gov.tarimkredi.dto.PersonelDTO;
import tr.gov.tarimkredi.service.PersonelService;

@RestController
public class PersonelController {
	@Autowired
	private PersonelService personelService;

	@GetMapping("/bolumAdi")
	public List<PersonelDTO> getPersoneller(String adi) {
		List<PersonelDTO> sonuc = new ArrayList<>();
		personelService.getPersoneller(adi).forEach(p -> {
			PersonelDTO dto = new PersonelDTO();
			dto.setAdi(p.getAdi());
			dto.setSoyadi(p.getSoyadi());
			dto.setEposta(p.getEposta());
			sonuc.add(dto);
		});
		return sonuc;
	}
}
