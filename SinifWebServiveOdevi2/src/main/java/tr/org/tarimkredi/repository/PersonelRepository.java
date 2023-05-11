package tr.org.tarimkredi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tr.org.tarimkredi.entity.Personel;

public interface PersonelRepository extends JpaRepository<Personel, UUID> {
	public Personel findByEposta(String eposta);

	@Query("from Personel p where p.bolum.adi = :adi")
	public List<Personel> findByBolumAdi(String adi);
}
