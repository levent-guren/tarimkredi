package ornek4;

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

	public Audi(int vites) {
		super();
		this.vites = vites;
	}

	public Audi() {
		this(4);
	}

	@Override
	public String toString() {
		return "Audi [vites=" + vites + ", getHiz()=" + getHiz() + "]";
	}

}
