package tr.org.tarimkredi.entity;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.id.uuid.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(exclude = "bolum")
@ToString(exclude = "bolum")
@Entity
public class Personel {
	@Id
	@GeneratedValue(generator = "uuid4")
	@GenericGenerator(name = "UUID", type = UuidGenerator.class)
	@Column(columnDefinition = "BINARY(16)", name = "id")
	private UUID id;

	@Column(length = 45)
	private String eposta;
	@Column(length = 45)
	private String adi;
	@Column(length = 45)
	private String soyadi;

	private byte yas;
	@Column(length = 5)
	private String cinsiyet;

	@ManyToOne
	private Bolum bolum;
}
