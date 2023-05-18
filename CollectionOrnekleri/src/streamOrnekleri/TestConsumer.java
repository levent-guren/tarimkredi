package streamOrnekleri;

import java.util.function.Consumer;

public class TestConsumer implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}
