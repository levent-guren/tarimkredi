package tr.org.tarimkredi.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.org.tarimkredi.dto.BolumDTO;
import tr.org.tarimkredi.entity.Bolum;
import tr.org.tarimkredi.exception.VeritabaniHatasi;
import tr.org.tarimkredi.repository.BolumRepository;

@RestController
@RequestMapping("/bolum")
public class BolumController {
	@Autowired
	private BolumRepository bolumRepository;
	@Autowired
	private ModelMapper mapper;

	@GetMapping("/")
	public ResponseEntity<List<BolumDTO>> getBolumler() {
//		List<Bolum> bolumler = bolumRepository.findAll();
		try {
			List<Bolum> bolumler = bolumRepository.getBolumler();
			List<BolumDTO> result = bolumler.stream().map(p -> mapper.map(p, BolumDTO.class)).collect(Collectors.toList());
			return ResponseEntity.ok(result);
		} catch (Exception e) {
			VeritabaniHatasi hata = new VeritabaniHatasi("Hata oluştu: " + e.getMessage(), e);
			throw hata;
		}
	}
}
