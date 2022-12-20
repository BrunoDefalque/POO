public class Animal {
	// Proprietes

	private String name;
	private String sex;
	private String food;
	private String ecosystem;
	private String espece;
	private int age;
	private int sleepHours;
	private boolean exotic;
	private boolean sterelized;

	// constructeur

	public Animal(String _name, String _sex, String _food, String _ecosystem, String _espece, int _age, int _sleepHours,
			boolean _exotic, boolean _sterelized) {
		name = _name;
		sex = _sex;
		food = _food;
		ecosystem = _ecosystem;
		espece = _espece;
		age = _age;
		sleepHours = _sleepHours;
		exotic = _exotic;
		sterelized = _sterelized;
	}

	// getters

	public String GetName() {
		return name;
	}

	public String GetSex() {
		return sex;
	}

	public String GetFood() {
		return food;
	}

	public String GetEcosystem() {
		return ecosystem;
	}

	public String GetEspece() {
		return espece;
	}

	public int GetAge() {
		return age;
	}

	public int GetSleepHours() {
		return sleepHours;
	}

	public boolean GetExotic() {
		return exotic;
	}

	public boolean GetSterelized() {
		return sterelized;
	}

	// setters;

	public void SetName(String _name) {
		name = _name;
	}

	public void SetSex(String _sex) {
		sex = _sex;
	}

	public void SetFood(String _food) {
		food = _food;
	}

	public void SetEcosystem(String _ecosystem) {
		ecosystem = _ecosystem;
	}

	public void SetEspece(String _espece) {
		espece = _espece;
	}

	public void SetAge(int _age) {
		age = _age;
	}

	public void SetSleepHours(int _sleepHours) {
		sleepHours = _sleepHours;
	}

	public void SetExotic(boolean _exotic) {
		exotic = _exotic;
	}

	public void SetSterelized(boolean _sterelized) {
		sterelized = _sterelized;
	}

	// OverRideMagic

	@Override

	public String toString() {

		return name + " est un " + espece + ", il est de sexe " + sex + ", il vit de manière " + ecosystem + ", il est agé de " + age + " ans !";
	}

	@Override

	public boolean equals(Object _a) {

		if (_a == null) {

			return false;
		}

		if (_a.getClass () != getClass()) {

			return false;
		}

		Animal _animal = (Animal) _a;

		if (name.equals(_animal.name) && sex.equals(_animal.sex) && food.equals(_animal.food) && ecosystem.equals(_animal.ecosystem) && espece.equals(_animal.espece) && age == _animal.age && sleepHours == _animal.sleepHours && exotic == _animal.exotic && sterelized == _animal.sterelized) {

			return true;

		}

		return false;
	}

	// methodes

	public void Dormir() {
		System.out.println(name + ", votre " + espece + " a besoin de " + sleepHours + " heurs de sommeil.");
	}

	public void Dormir(int _heurreCoucher) {

		System.out.println(name + ", votre " + espece + " se réveillera à " + (sleepHours + _heurreCoucher + "h"));
	}
	public void Dormir(boolean _periodeDodo) {

		if(_periodeDodo == true) {

		System.out.println(name + ", votre " + espece + " va dormir à " + sleepHours + "h et ce de manière diurne !");
		}

		else {

			System.out.println(name + ", votre " + espece + " va dormir à " + sleepHours + "h et ce de manière nocturne !");

		}
	}

	private void Eat() {
		switch (sex) {
			case "m":
				System.out.println("Il mange " + food + ".");
				break;
			case "f":
				System.out.println("Elle mange " + food + ".");
				break;
			default:
			
				System.out.println("ça mange " + food + ".");
				break;
		}
	}

}
