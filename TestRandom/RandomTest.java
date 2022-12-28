import java.util.Random;

/**
 * RandomTest
 */
public class RandomTest {

	public static void main(String[] args) {

		//int nbrMin = 5;

		//int nbrMax = 15;

		GenererNbrAleatoireBorne(1, 3);
	}

	public static void GenererNbrAleatoireBorne(int _nbrMin, int _nbrMax) {

		Random random = new Random();

		int _nbrAleatoire = random.nextInt(_nbrMax + _nbrMin) + _nbrMin;

		System.out.println(_nbrAleatoire);
	}
}