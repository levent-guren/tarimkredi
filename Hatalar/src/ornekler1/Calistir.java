package ornekler1;

public class Calistir {
	public static void main(String[] args) {
		try {
			int sonuc = hesapla();
			System.out.println(sonuc);
		} catch (Exception ex) {
			System.out.println("hata mesaji:" + ex.getMessage());
		}
	}

	private static int hesapla() throws Exception {
		int sayi = 30;
		int sayi2 = 0;
		if (sayi2 == 0) {
			// hata
			throw new Exception("hata1");
		}
		return sayi / sayi2;
	}

}
