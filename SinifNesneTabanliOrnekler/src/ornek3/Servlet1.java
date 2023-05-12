package ornek3;

public class Servlet1 extends BaseServlet {
	@Override
	public void get() {
		System.out.println("Servlet1.get()");
	}

	@Override
	public void post() {
		System.out.println("Servlet1.post()");
	}
}
