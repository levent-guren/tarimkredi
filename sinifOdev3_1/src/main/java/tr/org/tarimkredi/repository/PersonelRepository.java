package tr.org.tarimkredi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tr.org.tarimkredi.entity.Personel;

public interface PersonelRepository extends JpaRepository<Personel, UUID> {
	public long countByBolumAdiContainsIgnoreCase(String bolumAdi);

	@Query("select count(p) from Personel p where p.bolum.adi = :bolumAdi")
	public long getPersonelSayisi(String bolumAdi);

	@Query(value = "select count(*) from personel p join bolum b on(p.bolum_id = b.id) where b.adi = :bolumAdi", nativeQuery = true)
	public long getPersonelSayisiNativeSorgu(String bolumAdi);
}
