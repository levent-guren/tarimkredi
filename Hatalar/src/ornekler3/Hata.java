package ornekler3;

public class Hata extends RuntimeException {
	private static final long serialVersionUID = -747653756829625L;
	private int hataKodu;

	public int getHataKodu() {
		return hataKodu;
	}

	public void setHataKodu(int hataKodu) {
		this.hataKodu = hataKodu;
	}

}
