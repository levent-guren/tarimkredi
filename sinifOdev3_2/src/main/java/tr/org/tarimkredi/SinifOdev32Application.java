package tr.org.tarimkredi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SinifOdev32Application {

	public static void main(String[] args) {
		SpringApplication.run(SinifOdev32Application.class, args);
	}

}
