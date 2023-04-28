package deneme2;

public class Calistir {

	public static void main(String[] args) {
		Cocuk cocuk1 = new Cocuk();
		cocuk1.setAdi("Ahmet");
		cocuk1.setYas(23);

		Cocuk cocuk2 = new Cocuk();
		cocuk2.setAdi("Aslı");
		cocuk2.setYas(8);

		Anne anne1 = new Anne();
		anne1.setAdi("Asuman");
		anne1.setCocuk(cocuk1);

		Anne anne2 = new Anne();
		anne2.setAdi("Gözde");
		anne2.setCocuk(cocuk2);

		System.out.println(anne1.getCocuk().getAdi());
		System.out.println(anne2.getAdi());

		anne1.setCocuk(anne2.getCocuk());
		anne2.setAdi(anne1.getCocuk().getAdi());

		System.out.println(anne2.getCocuk().getAdi());
		System.out.println(anne1.getAdi());

		System.out.println(anne2.getAdi());
	}

}
