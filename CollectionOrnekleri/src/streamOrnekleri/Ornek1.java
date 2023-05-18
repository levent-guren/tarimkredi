package streamOrnekleri;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ornek1 {
	public static void main(String[] args) {
		List<String> liste = new ArrayList<>();
		liste.add("Ankara");
		liste.add("İstanbul");
		liste.add("İzmir");
		liste.add("Balıkesir");

		liste.stream().forEach(new TestConsumer());
		System.out.println("-----------------------");
		liste.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		System.out.println("-------------------------");
		liste.stream().forEach((String t) -> {
			System.out.println(t);
		});
		System.out.println("-------------------------");
		liste.stream().forEach(t -> {
			System.out.println(t);
		});
		System.out.println("-------------------------");
		liste.stream().forEach(t -> System.out.println(t));
		System.out.println("-------------------------");
		liste.stream().forEach(System.out::println);
		System.out.println("-------------------------");
		liste.parallelStream().forEach(System.out::println);

	}
}
