package ornek3;

public abstract class BaseServlet {
	public static enum RequestType {
		GET, POST;
	}

	public void execute(RequestType tip) {
		System.out.println("Servlet.execute()");
		if (tip == RequestType.GET) {
			get();
		} else {
			post();
		}
	}

	public abstract void post();

	public abstract void get();
}
