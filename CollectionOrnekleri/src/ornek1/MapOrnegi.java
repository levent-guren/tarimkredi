package ornek1;

import java.util.HashMap;
import java.util.Map;

public class MapOrnegi {

	public static void main(String[] args) {
		Map<Integer, String> sehirler = new HashMap<>();
		sehirler.put(6, "Ankara");
		sehirler.put(34, "İstanbul");
		sehirler.put(35, "İzmir");
		sehirler.put(1, "Adana");
		sehirler.put(16, "Bursa");
		yaz(sehirler);
	}

	private static void yaz(Map<Integer, String> sehirler) {
		for (Integer plaka : sehirler.keySet()) {
			System.out.println(plaka + ": " + sehirler.get(plaka));
		}
	}

}
