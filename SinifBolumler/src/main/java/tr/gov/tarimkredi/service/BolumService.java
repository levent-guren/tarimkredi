package tr.gov.tarimkredi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.gov.tarimkredi.entity.Bolum;
import tr.gov.tarimkredi.repository.BolumRepository;

@Service
public class BolumService {
	@Autowired
	private BolumRepository bolumRepository;

	public List<Bolum> getBolumlerByAdi(String adi) {
		return bolumRepository.findByAdiContainsIgnoreCase(adi);
	}
}
