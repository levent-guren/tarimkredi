package tr.org.tarimkredi.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = { "userRoles" })
@EqualsAndHashCode(exclude = { "userRoles" })
public class User {
	@Id
	@Column(unique = true, nullable = false)
	private String email;
	private String name;
	private String password;
	private String privatekey;

	@OneToMany(mappedBy = "user")
	private List<UserRole> userRoles;
}
