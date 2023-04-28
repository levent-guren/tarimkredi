package degiskenler;

public class Calistir {
	public static void main(String[] args) {
		byte b = 3;
		short c = 5;
		int a = 4;
		long l = 6_000_000_000L;
		float f = 3.443756329857326985743658f;
		double d = 4.7;
		boolean buyuk = false;
		char ch = 'A';

		a = 0140;
		System.out.println(a);
		a = 070;
		System.out.println(a);
		a = 0xFF;
		System.out.println(a);
		a = 0b11111111;
		System.out.println(a);

		if (b > 10) {
			System.out.println("b>10");
		} else {
			System.out.println("b<=10");
		}
	}
}
