package tr.org.tarimkredi.entity;

import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.id.uuid.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(exclude = "personeller")
@ToString(exclude = "personeller")
@Entity
public class Bolum {
	@Id
	@GeneratedValue(generator = "uuid4")
	@GenericGenerator(name = "UUID", type = UuidGenerator.class)
	@Column(columnDefinition = "BINARY(16)", name = "id")
	private UUID id;
	@Column(length = 45)
	private String adi;

	@OneToMany(mappedBy = "bolum")
	private List<Personel> personeller;
}
