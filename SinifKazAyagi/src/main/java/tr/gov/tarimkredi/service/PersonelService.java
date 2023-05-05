package tr.gov.tarimkredi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.gov.tarimkredi.entity.Personel;
import tr.gov.tarimkredi.repository.PersonelRepository;

@Service
public class PersonelService {
	@Autowired
	private PersonelRepository personelRepository;

	public List<Personel> getAllPersonels() {
		return personelRepository.findAll();
	}
}
