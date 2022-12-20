/**
 * Product
 */
public class Product {

    // propriété

    protected String productName;

    protected String color;

    protected int memory;

    // Constructeur

    public Product(String _productName, String _color, int _memory) {

        productName = _productName;

        color = _color;

        memory = _memory;
    }

    // Getters

    public String GetProductName() {

        return productName;
    }

    public String GetColor() {
        return color;
    }

    public int GetMemory() {
        return memory;
    }

    // Setters

    public void SetProductName(String _productName) {

        productName = _productName;
    }

    public void SetColor(String _color) {

        color = _color;
    }

    public void SetMemory(int _memory) {

        memory = _memory;
    }

    // création des fonctions magique
    //toString

    @Override

    public String toString() {

        return "Le produit est un(e) " + productName + " de couleur " + color + " avec une capacité de " + memory + "GB";
    }
}