package ornekler2;

public class Calistir {
	public static void main(String[] args) {
		try {
			int sonuc = hesapla();
			System.out.println(sonuc);
		} catch (VeritabaniHatasi ex) {
			System.out.println("hata:");
		} catch (Exception ex) {
			System.out.println("hata:");
		}
	}

	private static int hesapla() throws Hata, VeritabaniHatasi {
		int sayi = 30;
		int sayi2 = 0;
		if (sayi2 == 0) {
			// hata
			throw new Hata();
		} else if (sayi2 % 2 == 0) {
			// hata
			throw new VeritabaniHatasi();
		}
		return sayi / sayi2;
	}

}
