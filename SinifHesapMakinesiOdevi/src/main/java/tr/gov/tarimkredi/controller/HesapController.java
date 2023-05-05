package tr.gov.tarimkredi.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HesapController {
//	@GetMapping("/")
//	public String hesapla(int sayi1, int sayi2, String islem) {
//		int sonuc = 0;
//		if ("TOPLA".equals(islem)) {
//			sonuc = sayi1 + sayi2;
//		} else if ("CARPMA".equals(islem)) {
//			sonuc = sayi1 * sayi2;
//		} else if ("CIKARMA".equals(islem)) {
//			sonuc = sayi1 - sayi2;
//		} else if ("BOLME".equals(islem)) {
//			sonuc = sayi1 / sayi2;
//		}
//		return String.valueOf(sonuc);
//	}
	@GetMapping("/")
	public String hesapla(int sayi1, int sayi2, String islem) {
		double sonuc = 0;
		if ("TOPLA".equals(islem)) {
			sonuc = sayi1 + sayi2;
		} else if ("CARPMA".equals(islem)) {
			sonuc = sayi1 * sayi2;
		} else if ("CIKARMA".equals(islem)) {
			sonuc = sayi1 - sayi2;
		} else if ("BOLME".equals(islem)) {
			sonuc = sayi1 / (double) sayi2;
		}
		return String.valueOf(sonuc);
	}

	@GetMapping("/para")
	public String hesaplaPara(String sayi1, String sayi2, String islem) {
		BigDecimal para1 = new BigDecimal(sayi1);
		BigDecimal para2 = new BigDecimal(sayi2);
		BigDecimal sonuc = BigDecimal.ZERO;
		if ("TOPLA".equals(islem)) {
			sonuc = para1.add(para2);
		} else if ("CARPMA".equals(islem)) {
			sonuc = para1.multiply(para2);
		} else if ("CIKARMA".equals(islem)) {
			sonuc = para1.subtract(para2);
		} else if ("BOLME".equals(islem)) {
			sonuc = para1.divide(para2, 1000, RoundingMode.HALF_UP);
		}
		return String.valueOf(sonuc);
	}
}
