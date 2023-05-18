package streamOrnekleri;

import java.util.ArrayList;
import java.util.List;

public class Ornek2 {
	public static void main(String[] args) {
		List<String> liste = new ArrayList<>();
		liste.add("Ankara");
		liste.add("İstanbul");
		liste.add("İzmir");
		liste.add("Balıkesir");

		liste.stream().map(sehir -> sehir.length()).forEach(System.out::println);
		System.out.println("--------------");
		liste.stream().map(sehir -> sehir.length()).filter(sayi -> sayi > 7).forEach(System.out::println);
		////////////////////////////////
		for (int i = 0; i < liste.size(); i++) {
			String sehir = liste.get(i);
			int uzunluk = sehir.length();
			if (uzunluk > 7) {
				System.out.println(uzunluk);
			}
		}
	}
}
