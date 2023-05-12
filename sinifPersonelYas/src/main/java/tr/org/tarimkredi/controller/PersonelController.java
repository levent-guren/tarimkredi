package tr.org.tarimkredi.controller;

import java.util.List;
import java.util.stream.Collectors;

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

	@GetMapping("/yasaGore")
	public List<PersonelDTO> getPersonellerByYas(int yas) {
		List<Personel> personeller = personelService.getPersoneller(yas);
		return personeller.stream().map(p -> modelMapper.map(p, PersonelDTO.class)).collect(Collectors.toList());
	}

}
