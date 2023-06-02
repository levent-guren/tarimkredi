package ornekler3;

public class Calistir {
	public static void main(String[] args) {
		try {
			int sonuc = hesapla();
			System.out.println(sonuc);
		} catch (Hata e) {
			System.out.println("Hata oluştu: " + e.getHataKodu());
		}
	}

	private static int hesapla() {
		int sayi = 30;
		int sayi2 = 0;
		if (sayi2 == 0) {
			// hata
			Hata hata = new Hata();
			hata.setHataKodu(123);
			throw hata;
		}
		return sayi / sayi2;
	}

}
