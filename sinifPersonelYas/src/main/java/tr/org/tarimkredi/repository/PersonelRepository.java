package tr.org.tarimkredi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tr.org.tarimkredi.entity.Personel;

public interface PersonelRepository extends JpaRepository<Personel, UUID> {
	@Query(value = "select * from personel where yas > :yas", nativeQuery = true)
	public List<Personel> yasiBuyukPersonelleriGetir(int yas);
}
