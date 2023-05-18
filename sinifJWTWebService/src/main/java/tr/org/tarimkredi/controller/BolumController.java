package tr.org.tarimkredi.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.org.tarimkredi.dto.BolumDTO;
import tr.org.tarimkredi.dto.BolumSayisiDTO;
import tr.org.tarimkredi.service.BolumService;

@RestController
public class BolumController {
	@Autowired
	private BolumService bolumService;
	@Autowired
	private ModelMapper mapper;

	@GetMapping("/bolumler")
	public ResponseEntity<List<BolumDTO>> getBolumler() {
		List<BolumDTO> result = bolumService.getTumBolumler().stream().map(p -> mapper.map(p, BolumDTO.class)).collect(Collectors.toList());
		return ResponseEntity.ok(result);
	}

	@GetMapping("/bolumSayisi")
	public ResponseEntity<BolumSayisiDTO> getBolumSayisi() {
		return ResponseEntity.ok(new BolumSayisiDTO(bolumService.getBolumSayisi()));
	}
}
