package degiskenler;

public class Donguler {
	public static void main(String[] args) {
		int a = 1;
		while (a < 10) {
			System.out.println(a);
			a = a + 1;
		}
		System.out.println("-------------");
		a = 1;
		do {
			System.out.println(a);
			a = a + 1;
		} while (a < 10);
		System.out.println("-------------");

		for (int x = 1; x < 10; x = x + 1) {
			System.out.println(x);
		}

	}
}
