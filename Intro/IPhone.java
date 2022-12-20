/**
 * IPhone
 */
public class IPhone extends Product {

    // propriétés

protected int nbrIPhone;

protected String force;

// Constructeur


public IPhone(String _productName, String _color, int _memory, int _nbrIPhone, String _force) {

    super(_productName, _color, _memory);

    nbrIPhone = _nbrIPhone;

    force = _force;

    }

// Getters

public int GetNbrIPhone() {
    return nbrIPhone;
}

public String GetForce() {
    return force;
}

// Setters

public void SetNbrIPhone(int _nbrIPhone) {

    nbrIPhone = _nbrIPhone;
}

public void SetForce(String _force) {

    force = _force;
}

// création des fonctions magique
//toString

@Override

public String toString() {

    return "Son smartPhone est un " + productName + " " + nbrIPhone + " " + force + "\nIl est de couleur " + color + " et il a une capacité de " + memory + "GB";
}
}