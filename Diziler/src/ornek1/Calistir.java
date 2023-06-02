package ornek1;

import java.util.ArrayList;
import java.util.List;

public class Calistir {

	public static void main(String[] args) {
		// collection

		List<String> isimler = new ArrayList<>();
		isimler.add("Ankara");
		isimler.add("İstanbul");
		isimler.add("İzmir");
		isimler.add("Sivas");
		System.out.println(isimler.get(3));

		// array
		String[] dizi = new String[4];
		dizi[0] = "Ankara";
		dizi[1] = "İstanbul";
		dizi[2] = "İzmir";
		dizi[3] = "Sivas";
		System.out.println(dizi[3]);

		dizi = new String[5];
		System.out.println(dizi[3]);

		System.out.println("---------------------");

		int[] sayilar = new int[3];
		System.out.println(sayilar[1]);
		sayilar[1] = 2;
		sayilar[2] = sayilar[1] * 2;
		System.out.println(sayilar[2]);

		for (int i : sayilar) {
			System.out.print(i + " ");
		}
	}
}
