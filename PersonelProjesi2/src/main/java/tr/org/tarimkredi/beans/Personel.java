package tr.org.tarimkredi.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Personel {
	@Id
	private int id;

	private String adi;
	private String soyadi;
	private String cinsiyet;
	private Integer yas;
}
