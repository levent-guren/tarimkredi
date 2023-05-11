package ornek2;

public class Factory {
	public static PersonelRepository getPersonelRepository() {
		return new PersonelRepositoryImpl();
	}

	public static BolumRepository getBolumRepository() {
		return new BolumRepositoryImpl();
	}
}
