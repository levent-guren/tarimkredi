package ornek2;

public class Calistir {
	public static void main(String[] args) {
		PersonelRepository personelRepository = Factory.getPersonelRepository();
		System.out.println(personelRepository.getSayi());

		BolumRepository bolumRepository = Factory.getBolumRepository();
		System.out.println(bolumRepository.getSayi());
	}
}
