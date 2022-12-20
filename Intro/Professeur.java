/**
 * Professeur
 */
public class Professeur extends Personne{

    private float salaire;

    private String coursDonner;

    private Student[] etudiants;

    // Constructeur

    public Professeur(String _name, int _age, float _taille, Float _poid, Animal _compagnon, float _salaire, String _coursDonner, Student[] _etudiants, IPhone _iPhonePerso) {

        super(_name, _age, _taille, _poid, _compagnon, _iPhonePerso);

        salaire = _salaire;

        coursDonner = _coursDonner;

        etudiants = _etudiants;
    }

    // Getter

    public float GetSalaire() {
        return salaire;
    }

    public String GetCoursDonner() {
        return coursDonner;
    }

    public Student[] GetEtudiants() {

        return etudiants;
    }

    // Setter

    public void SetSalaire(float _salaire) {
        salaire = _salaire;
    }

    public void SetCoursDonner(String _coursDonner) {
        coursDonner = _coursDonner;
    }

    public void SetEtudiants(Student[] _etudiants) {

        etudiants = _etudiants;
    }

    public void MoyenneReussiEtudiants() {

        float _succes = 0.0f;

        for (int i = 0; i < etudiants.length; i++) {

            if (etudiants[i].GetMoyenneStudent() >= 10) {

                _succes++;
            }
            
        }

        System.out.println(_succes / (float)etudiants.length * 100);
        
    }
}