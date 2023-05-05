package ornek1;

public class Calistir {
	public static void main(String[] args) {
		Araba araba = new Araba();
		araba.setHiz(30);

		Araba araba2 = new Araba();
		araba2.setHiz(50);

		System.out.println(araba.getHiz());
		System.out.println(araba2.getHiz());
	}
}
