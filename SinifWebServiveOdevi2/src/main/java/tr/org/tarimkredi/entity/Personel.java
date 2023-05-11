package tr.org.tarimkredi.entity;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "personel")
@Data
@ToString(exclude = { "bolum" })
@EqualsAndHashCode(exclude = { "bolum" })
public class Personel {
	@Id
	@GeneratedValue(generator = "uuid4")
	@GenericGenerator(name = "UUID", strategy = "uuid4")
	@Column(columnDefinition = "BINARY(16)", name = "id")
	private UUID id;

	private String eposta;
	private String adi;
	private String soyadi;
	private Integer yas;
	private String cinsiyet;

	@ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name = "bolum_id")
	private Bolum bolum;
}
