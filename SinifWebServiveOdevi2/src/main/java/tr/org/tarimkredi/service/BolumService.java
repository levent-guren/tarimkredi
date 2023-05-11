package tr.org.tarimkredi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.org.tarimkredi.entity.Bolum;
import tr.org.tarimkredi.repository.BolumRepository;

@Service
public class BolumService {
	@Autowired
	private BolumRepository bolumRepository;

	public long getBolumSayisi() {
		return bolumRepository.count();
	}

	public List<Bolum> getBolumlerBySayi(int sayi) {
		return bolumRepository.bolumleriGetir(sayi);
	}

	public List<Bolum> getBolumlerBySayi2(int sayi) {
		return bolumRepository.bolumleriGetir2(sayi);
	}

}
