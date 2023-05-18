package tr.org.tarimkredi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.org.tarimkredi.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
