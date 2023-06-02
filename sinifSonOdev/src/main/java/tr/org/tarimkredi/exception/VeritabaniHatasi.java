package tr.org.tarimkredi.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class VeritabaniHatasi extends RuntimeException {
	private static final long serialVersionUID = 5070704848253752016L;

	public VeritabaniHatasi(String message, Throwable cause) {
		super(message, cause);
	}

	private String hata;
}
