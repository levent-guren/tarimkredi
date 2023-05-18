package tr.org.tarimkredi.entity;

import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = { "roleUserRoles" })
@EqualsAndHashCode(exclude = { "roleUserRoles" })
public class Role {
	@Id
	@GeneratedValue(generator = "uuid4")
	@GenericGenerator(name = "UUID", strategy = "uuid4")
	@Column(columnDefinition = "BINARY(16)", name = "id")
	private UUID id;
	private String name;
	@OneToMany(mappedBy = "role")
	private List<UserRole> roleUserRoles;
}
