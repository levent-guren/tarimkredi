package ornek1;

public class Calistir {
	public static void main(String[] args) {
		Araba araba = new Araba();
		araba.setMarka("Audi");
		System.out.println(araba);

		Bmw bmw = new Bmw();
		bmw.setMarka("BMW");
		System.out.println(bmw);

		Araba deneme = new Bmw();
		bmw.setOtomatikPilot(false);
		bmw.setMarka("BMW");
		deneme.setMarka("Renault");
		// deneme.setOtomatikPilot false);
	}
}