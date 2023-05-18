package tr.org.tarimkredi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.org.tarimkredi.entity.Bolum;

public interface BolumRepository extends JpaRepository<Bolum, UUID> {
}
