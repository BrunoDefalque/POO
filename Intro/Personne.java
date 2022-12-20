/**
 * Personne
 */
public class Personne {

	//Propriété

	protected String name;

	protected int age;

	protected float taille;

	protected float poid;

	protected float imc;

	protected Animal compagnon;

	protected IPhone iPhonePerso;

	//Méthode (constructeur)

	public Personne(String _name, int _age, float _taille, Float _poid, Animal _compagnon, IPhone _iPhonePerso) {

		name = _name;

		age = _age;

		taille = _taille;

		poid = _poid;

		imc = CalculIMC(_poid, _taille);

		compagnon = _compagnon;

		iPhonePerso = _iPhonePerso;
	}

	// Création des fonctions Getters :

	public String GetName() {

		return name;
	}

	public int GetAge() {

		return age;
	}

	public float GetTaille(String _dataUnite){

		if (_dataUnite.equals("m")) {
		return taille;
		}

		else if (_dataUnite.equals("cm")) {

			return taille * 100;
		}

		return taille;
	}

	public float GetPoid(String _dataUnite) {

		switch (_dataUnite) {
			case "kg":
				return poid;
				case "g":

				return poid * 1000;

				case "l":

				return poid * 2.205f;

			default:
			System.out.println("Ereur d'encodage d'unité !! voir développeur");
		}
		return poid;
	}

	public float GetIMC() {

		return imc;
	}

	public Animal GetCompagnon() {

		return compagnon;
	}

	public IPhone GetIPhonePerso() {

		return iPhonePerso;
	}

	// création des fonctions Setters :

	public void SetName(String _name) {

	//	name = _name;
	}

	public void SetAge(int _newAge) {

		age = _newAge;
	}

	public void SetTaille(float _newTaille) {
		
		taille = _newTaille;

		imc = CalculIMC(poid, _newTaille);
	}

	public void SetPoid(float _newPoid) {

		poid = _newPoid;

		imc = CalculIMC(_newPoid, taille);
	}

	public void SetCompagnon(Animal _newCompagnon) {

		compagnon = _newCompagnon;
	}

	public void SetIPhonePerso(IPhone _iPhonePerso) {

		iPhonePerso = _iPhonePerso;
	}

	// création des fonctions magique :

	// fonction toString

	@Override

	public String toString() {

		return name + " est agé de " + age + " ans ! Son animal de compagnie est un " + compagnon.GetEspece() + "\nIl/ Elle pèse " + poid + " kg et mesure " + taille + " m, donc son imc est de " + imc + "\n" + GetIPhonePerso();

	}

	// Fonction equals

	@Override

	public boolean equals(Object _p) {

		if (_p == null) {

			return false;
		}

		if (_p.getClass () != getClass()) {

			return false;
		}

		Personne _personne = (Personne) _p;

		if (name.equals(_personne.name) && age == _personne.age && taille == _personne.taille && poid == _personne.poid && imc == _personne.imc && compagnon.equals(_personne.compagnon)) {

			return true;

		}

		return false;
	}

	

	// création de la fonction IMC

	private float CalculIMC(float _poid, Float _taille) {

		return _poid/ (_taille* _taille);
		

	}

	
}