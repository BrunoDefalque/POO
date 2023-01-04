import java.util.Random;

/**
 * RandomTest
 */
public class RandomTest {

	public static void main(String[] args) {

		//int nbrMin = 5;

		//int nbrMax = 15;

		System.out.println(GenererNbrAleatoireBorne(2, 10));
	}

	public static int GenererNbrAleatoireBorne(int _nbrMin, int _nbrMax) {

		Random random = new Random();

		int _nbrAleatoire = random.nextInt(_nbrMax + _nbrMin);

		return _nbrAleatoire;
	}
}