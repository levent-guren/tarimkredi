package deneme1;

public class Calistir {

	public static void main(String[] args) {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setAdi("Levent");
		String adi = "Mulayim";
		test(ogrenci);
		test2(adi);
		System.out.println(ogrenci.getAdi());
		System.out.println(adi);
	}

	public static void test(Ogrenci ogrenci) {
		ogrenci = new Ogrenci();
		ogrenci.setAdi("Mehmet");
	}

	public static void test2(String adi) {
		adi = "Kamil";
	}

}
