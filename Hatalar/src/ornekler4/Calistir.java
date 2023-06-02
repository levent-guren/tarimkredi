package ornekler4;

public class Calistir {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			bekle(500);
		}
	}

	private static void bekle(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			System.out.println("hata");
		}
	}
}
