package ornek1;

import java.util.ArrayList;
import java.util.List;

public class Liste {

	public static void main(String[] args) {
		List<String> liste = new ArrayList<String>();
		liste.add("Merhaba");
		liste.add("Dünya");
//		liste.add(new Integer(5));
		yaz(liste);
	}

	private static void yaz(List<String> liste) {
		for (int i = 0; i < liste.size(); i++) {
			String s = liste.get(i);

			System.out.println(liste.get(i));
			System.out.println(s.length());
		}
	}

}
