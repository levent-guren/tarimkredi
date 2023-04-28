package tr.org.tarimkredi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.org.tarimkredi.beans.Personel;

public interface PersonelRepository extends JpaRepository<Personel, Integer> {

}
