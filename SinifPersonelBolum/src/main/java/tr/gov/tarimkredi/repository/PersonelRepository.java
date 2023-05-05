package tr.gov.tarimkredi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.gov.tarimkredi.entity.Personel;

public interface PersonelRepository extends JpaRepository<Personel, UUID> {
	public List<Personel> findByBolumAdiContainsIgnoreCase(String bolumAdi);
}
