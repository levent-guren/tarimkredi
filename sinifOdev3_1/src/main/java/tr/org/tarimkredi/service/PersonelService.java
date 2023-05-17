package tr.org.tarimkredi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.org.tarimkredi.entity.Personel;
import tr.org.tarimkredi.repository.PersonelRepository;

@Service
public class PersonelService {
	@Autowired
	private PersonelRepository personelRepository;

	public long getPersonelSayisi(String bolumAdi) {
		return personelRepository.countByBolumAdiContainsIgnoreCase(bolumAdi);
//		return personelRepository.getPersonelSayisi(bolumAdi);
//		return personelRepository.getPersonelSayisiNativeSorgu(bolumAdi);
	}

	public List<Personel> getTumPersoneller() {
		return personelRepository.findAll();
	}
}
