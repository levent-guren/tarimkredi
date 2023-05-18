package tr.org.tarimkredi.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.org.tarimkredi.dto.PersonelDTO;
import tr.org.tarimkredi.dto.PersonelSayisiDTO;
import tr.org.tarimkredi.service.PersonelService;

@RestController
public class PersonelController {
	@Autowired
	private PersonelService personelService;
	@Autowired
	private ModelMapper mapper;

	@GetMapping("/personeller")
	public ResponseEntity<List<PersonelDTO>> getPersoneller() {
		List<PersonelDTO> result = personelService.getTumPersoneller().stream().map(p -> mapper.map(p, PersonelDTO.class)).collect(Collectors.toList());
		return ResponseEntity.ok(result);
	}

	@GetMapping("/personelSayisi")
	public ResponseEntity<PersonelSayisiDTO> getPersonelSayisi() {
		return ResponseEntity.ok(new PersonelSayisiDTO(personelService.getPersonelSayisi()));
	}
}
