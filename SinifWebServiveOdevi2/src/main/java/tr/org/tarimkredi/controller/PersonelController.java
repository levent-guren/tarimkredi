package tr.org.tarimkredi.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.org.tarimkredi.dto.PersonelDTO;
import tr.org.tarimkredi.entity.Personel;
import tr.org.tarimkredi.service.PersonelService;

@RestController
@RequestMapping("/personel")

public class PersonelController {
	@Autowired
	private PersonelService personelService;
	@Autowired
	private ModelMapper modelMapper;

	@GetMapping("/eposta")
	public PersonelDTO getPersonelByEposta(String eposta) {
		Personel personel = personelService.getPersonelByEposta(eposta);
		PersonelDTO personelDTO = modelMapper.map(personel, PersonelDTO.class);
		return personelDTO;
	}

	@GetMapping("/sayi")
	public long getPersonelSayisi() {
		return personelService.getPersonelSayisi();
	}

}
