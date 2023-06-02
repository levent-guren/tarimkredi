package tr.org.tarimkredi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tr.org.tarimkredi.entity.Bolum;

public interface BolumRepository extends JpaRepository<Bolum, UUID> {
	@Query(value = "select * from blm", nativeQuery = true)
	public List<Bolum> getBolumler();
}
