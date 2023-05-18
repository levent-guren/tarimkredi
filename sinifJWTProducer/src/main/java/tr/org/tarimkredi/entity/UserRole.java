package tr.org.tarimkredi.entity;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = { "user", "role" })
@EqualsAndHashCode(exclude = { "user", "role" })
public class UserRole {
	@Id
	@GeneratedValue(generator = "uuid4")
	@GenericGenerator(name = "UUID", strategy = "uuid4")
	@Column(columnDefinition = "BINARY(16)", name = "id")
	private UUID id;
	@ManyToOne
	private User user;
	@ManyToOne
	private Role role;
}
