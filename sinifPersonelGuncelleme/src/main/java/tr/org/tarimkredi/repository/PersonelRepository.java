package tr.org.tarimkredi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.org.tarimkredi.entity.Personel;

public interface PersonelRepository extends JpaRepository<Personel, UUID> {
	public void deleteByEposta(String email);
}
