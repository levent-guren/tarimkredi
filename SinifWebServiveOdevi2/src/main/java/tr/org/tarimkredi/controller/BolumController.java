package tr.org.tarimkredi.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.org.tarimkredi.dto.BolumDTO;
import tr.org.tarimkredi.entity.Bolum;
import tr.org.tarimkredi.service.BolumService;

@RestController
@RequestMapping("/bolum")
public class BolumController {
	@Autowired
	private BolumService bolumService;
	@Autowired
	private ModelMapper mapper;

	@GetMapping("/sayi")
	public long getBolumSayisi() {
		return bolumService.getBolumSayisi();
	}

	@GetMapping("/bolumPersonelSayi")
	public List<BolumDTO> getBolumlerByPersonelSayisi(int sayi) {
		List<Bolum> bolumler = bolumService.getBolumlerBySayi2(sayi);
//		List<BolumDTO> sonuc = new ArrayList<>();
//		for (int i = 0; i < bolumler.size(); i++) {
//			Bolum bolum = bolumler.get(i);
//			BolumDTO bolumDTO = mapper.map(bolum, BolumDTO.class);
//			sonuc.add(bolumDTO);
//		}
		return bolumler.stream().map(b -> mapper.map(b, BolumDTO.class)).collect(Collectors.toList());
	}
}
