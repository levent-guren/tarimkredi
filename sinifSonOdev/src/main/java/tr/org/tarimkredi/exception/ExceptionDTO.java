package tr.org.tarimkredi.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExceptionDTO {
	private String hata;
	private int hataKodu;
}
