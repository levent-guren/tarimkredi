package ornek3;

public class Audi extends Araba {
	private int vites;

	public int getVites() {
		return vites;
	}

	public void setVites(int vites) {
		this.vites = vites;
	}

	@Override
	public int getHiz() {
		return 10;
	}

	public int test() {
		return super.getHiz();
	}
}
