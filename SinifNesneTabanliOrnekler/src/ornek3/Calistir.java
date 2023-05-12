package ornek3;

import ornek3.BaseServlet.RequestType;

public class Calistir {
	public static void main(String[] args) {
		Servlet1 servlet1 = new Servlet1();
		servlet1.execute(RequestType.GET);
	}
}
