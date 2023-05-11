package tr.org.tarimkredi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tr.org.tarimkredi.entity.Bolum;

public interface BolumRepository extends JpaRepository<Bolum, UUID> {
	public List<Bolum> findByAdiContainsIgnoreCase(String adi);

	// public List<Bolum> findByGreaterThanCountPersoneller(int sayi);

	@Query("from Bolum b where count(b.personeller) > :sayi")
	public List<Bolum> bolumleriGetir(int sayi);

	@Query(value = "select * from bolum b where :sayi <= (select count(*) from personel p where p.bolum_id = b.id)", nativeQuery = true)
	public List<Bolum> bolumleriGetir2(int sayi);

}
