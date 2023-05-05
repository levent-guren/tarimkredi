package tr.gov.tarimkredi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.gov.tarimkredi.entity.Bolum;
import tr.gov.tarimkredi.service.BolumService;

@RestController
public class BolumController {
	@Autowired
	private BolumService bolumService;

	@GetMapping("/")
	public List<Bolum> getBolumler(String adi) {
		return bolumService.getBolumlerByAdi(adi);
	}
}
