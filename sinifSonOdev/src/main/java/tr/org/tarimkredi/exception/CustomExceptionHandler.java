package tr.org.tarimkredi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<ExceptionDTO> hataOlustu(RuntimeException ex, WebRequest request) {
		ex.printStackTrace();
		ExceptionDTO dto = new ExceptionDTO("Hata oluştu: " + ex.getMessage(), 102);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dto);
	}

	@ExceptionHandler(value = { ArithmeticException.class })
	public ResponseEntity<ExceptionDTO> matematikHatasi(RuntimeException ex, WebRequest request) {
		ex.printStackTrace();
		ExceptionDTO dto = new ExceptionDTO("Hata oluştu(matematik)", 101);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dto);
	}
}
