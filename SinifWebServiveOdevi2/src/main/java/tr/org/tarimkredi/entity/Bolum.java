package tr.org.tarimkredi.entity;

import java.util.ArrayList;
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
@ToString(exclude = { "personeller" })
@EqualsAndHashCode(exclude = { "personeller" })
public class Bolum {
	@Id
	@GeneratedValue(generator = "uuid4")
	@GenericGenerator(name = "UUID", strategy = "uuid4")
	@Column(columnDefinition = "BINARY(16)", name = "id")
	private UUID id;

	private String adi;

	@OneToMany(mappedBy = "bolum")
	private List<Personel> personeller = new ArrayList<>();
}
