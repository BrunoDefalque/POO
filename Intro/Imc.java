/**
 * Imc
 */
public class Imc {

    public static void main(String[] args) {

        CalculImc(2, 90);
    }
    public static void CalculImc(float _poid, float _taille) {

        float _calculImc = _poid / (_taille * _taille);

        System.out.println(_calculImc);

       // return _calculImc;
    }
