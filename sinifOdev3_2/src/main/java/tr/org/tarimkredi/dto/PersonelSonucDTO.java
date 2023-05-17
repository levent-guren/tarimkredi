package tr.org.tarimkredi.dto;

import java.util.List;

import lombok.Data;

@Data
public class PersonelSonucDTO {
	private List<PersonelDTO> personeller;
	private long personelSayisi;
}
