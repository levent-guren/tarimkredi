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

	public List<Personel> getPersoneller(int yas) {
		return personelRepository.yasiBuyukPersonelleriGetir(yas);
	}
}