package tr.org.tarimkredi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.org.tarimkredi.entity.Personel;
import tr.org.tarimkredi.repository.PersonelRepository;

@Service
public class PersonelService {
	@Autowired
	private PersonelRepository personelRepository;

	public Personel getPersonelByEposta(String eposta) {
		return personelRepository.findByEposta(eposta);
	}

	public long getPersonelSayisi() {
		return personelRepository.count();
	}
}
