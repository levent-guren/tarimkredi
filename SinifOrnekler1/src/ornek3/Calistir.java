package ornek3;

public class Calistir {
	public static void main(String[] args) {
		Audi audi = new Audi();
		audi.setHiz(50);
		audi.setVites(2);

		System.out.println(audi.getHiz());
		System.out.println(audi.getVites());
		System.out.println(audi.test());
	}
}
