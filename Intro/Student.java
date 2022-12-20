/**
 * Student
 */
public class Student extends Personne {

    private int nbrStudent;

    private float moyenneStudent;

    private String coursPreferer;

    public Student (String _name, int _age, float _taille, Float _poid, Animal _compagnon, int _nbrStudent, Float _moyenneStudent, String _coursPreferer, IPhone _iPhonePerso) {

        super(_name, _age, _taille, _poid, _compagnon, _iPhonePerso);

        nbrStudent = _nbrStudent;

        moyenneStudent = _moyenneStudent;

    coursPreferer = _coursPreferer;
}

    // Getter :

    public int GetNbrStudent() {

        return nbrStudent;

    }

    public Float GetMoyenneStudent() {

        return moyenneStudent;
    }

    
    public String GetCoursPreferer() {

        return coursPreferer;

    }

    // Setter :

    public void SetNbrStudent(int _nbrStudent) {

        nbrStudent = _nbrStudent;
    }

    public void SetMoyenneStudent(Float _moyenneStudent) {

        moyenneStudent = _moyenneStudent;
    }

    public void SetCoursPreferer(String _coursPreferer) {

        coursPreferer = _coursPreferer;
    }
    
   /* public float PoidMoyenParAn() {
   
        return poid / (float) age;
    }
    */

}