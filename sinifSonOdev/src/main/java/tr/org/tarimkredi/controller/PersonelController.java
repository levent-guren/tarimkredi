package tr.org.tarimkredi.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.org.tarimkredi.dto.PersonelDTO;
import tr.org.tarimkredi.entity.Personel;
import tr.org.tarimkredi.repository.PersonelRepository;

@RestController
@RequestMapping("/personel")
public class PersonelController {
	@Autowired
	private PersonelRepository personelRepository;
	@Autowired
	private ModelMapper mapper;

	@GetMapping("/")
	public ResponseEntity<List<PersonelDTO>> getPersoneller() {
		List<Personel> personeller = personelRepository.findAll();
		List<PersonelDTO> result = personeller.stream().map(p -> mapper.map(p, PersonelDTO.class)).collect(Collectors.toList());
		return ResponseEntity.ok(result);
	}
}
