package ornek1;

import java.util.HashSet;
import java.util.Set;

public class Kume {

	public static void main(String[] args) {
		Set<String> kume = new HashSet<>();
		kume.add("Ankara");
		kume.add("İstanbul");
		kume.add("İzmir");
		kume.add("Adana");
		kume.add("Bursa");
		yaz(kume);
	}

	private static void yaz(Set<String> kume) {
		for (String sehir : kume) {
			System.out.println(sehir);
		}
	}

}
