/**
 * Main
 */
public class Main {

	

	public static void main(String[] args) {

		Animal tokyo = new Animal("Tokyo", "m", "Carnivore", "terrestre", "chien", 2, 15, false, true);

		Oiseau oscar = new Oiseau("Oscar", "m", "carnivore", "air","oiseau", 3, 15, false, true, 9, true);

		Fish adrien = new Fish("Adrien", "m", "carnivore", "eau","poisson", 1, 15, false, true, 4, "oui");

		Reptile marcel = new Reptile("Marcel", "m", "carnivore", "terrestre","serpent", 1, 15, false, true, true);

		IPhone iPhone14Pro = new IPhone("iPhone", "mauve", 128, 14, "Pro");




		IPhone iPhone14 = new IPhone("iPhone", "rouge", 64, 14, null);

		IPhone iPhone142 = new IPhone("iPhone", "rouge", 64, 14, null);
		Student sebastien = new Student("Sébastien", 39, 1.75f, 80f, null, 1, 18.22f, "Mysql", iPhone14);

    Student bruno = new Student("Bruno", 43, 1.8f, 90f, tokyo, 2, 19f, "java", iPhone14Pro);

		Student bruno1 = new Student("Bruno", 43, 1.8f, 90f, tokyo, 2, 19f, "java", iPhone14Pro);

    Student simon = new Student("Simon", 23, 1.65f, 56f, tokyo, 3, 8.2f, "anglais", iPhone14);

    Student david = new Student("David", 34, 1.82f, 100f, tokyo, 4, 16.5f, "javaaaaaaaaaaaaaaa", iPhone14Pro);

	Student[] etudiants = {sebastien, bruno, simon, david};
		
		Professeur johnny = new Professeur("Johnny", 47, 1.70f, 83f, oscar, 2850.69f, "Mysql", etudiants, iPhone14);

	//	Professeur philip = new Professeur("Philip", 24, 1.80f, 83f, oscar, 2850.69f, "Java");

		Professeur philip = new Professeur("Philip", 24, 1.80f, 80f, oscar, 2850.69f, "Java", etudiants, iPhone14Pro);

		IPhone iPhoneBru = new IPhone("iPhone", "noir", 128, 14, "Pro");

       Product mac1 = new Product("Mac", "blanc", 1000);

	  // System.out.println(bruno.GetIPhonePerso());

//	System.out.println(johnny.GetSalaire() + " et voici le salaire de " + philip.GetSalaire());

	//System.out.println(david.GetCoursPreferer());

	// tokyo.SetSleep();
//	tokyo.Dormir();

// faire un guetteur et sept heures pour le Printnl ici en bas

// System.out.println(tokyo.GetDormir());

//	System.out.println(bruno.GetIMC());

//System.out.println(johnny.GetCompagnon().GetFood());

// afficher tous d la méthode toString fichier Personne. 

// System.out.println(bruno.toString());

// afficher tous de l'animal de compagnie de la méthode toString, fichier Animal

//System.out.println(johnny.GetCompagnon().toString());

// teste d'égalité ou pas de la fonction equals fichier Animal

//System.out.println(tokyo.equals(tokyo));

//System.out.println(tokyo.equals(oscar));

// teste d'égalité ou pas de la fonction equals fichier Personne

//System.out.println(bruno.equals(bruno));

//System.out.println(bruno.equals(david));

//System.out.println(bruno.GetCompagnon().equals(bruno.GetCompagnon()));

//System.out.println(bruno.GetCompagnon().equals(david.GetCompagnon()));

//System.out.println(johnny.equals(philip));

//System.out.println(johnny.GetSalaire() != philip.GetSalaire());

//johnny.MoyenneReussiEtudiants();


//System.out.println(oscar.GetTempsDeVol());

//System.out.println(tokyo);

//tokyo.Dormir();


//adrien.Dormir(false);

//marcel.Dormir();

//Animal mutan;

//mutan = new Reptile("Sonette", "f", "carnivore", "terrestre","serpent", 1, 7, false, true, true);

//mutan.Dormir(true);

//System.out.println(mutan);

//tokyo.Dormir(false);

//tokyo.Dormir(20);


//adrien.Dormir();

//marcel.Dormir(true);

//System.out.println(iPhoneBru.toString());

//System.out.println(iPhoneBru.GetForce());

//System.out.println(philip.GetIPhonePerso());

//System.out.println(philip);

System.out.println(bruno);

System.out.println(iPhone14.equals(iPhone14Pro));

		System.out.println(iPhone142.GetProductName().equals(iPhone14.GetProductName()));

		System.out.println(iPhone14.equals(iPhone14));


		System.out.println(bruno.GetAge() == bruno1.GetAge());

		System.out.println();
	}
}