package tr.gov.tarimkredi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.gov.tarimkredi.entity.Bolum;

public interface BolumRepository extends JpaRepository<Bolum, UUID> {
	public List<Bolum> findByAdiContainsIgnoreCase(String adi);
}
