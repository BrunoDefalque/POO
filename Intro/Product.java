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

    /*
    @Override

    public String toString() {

        return "Le produit est un(e) " + productName + " de couleur " + color + " avec une capacité de " + memory + "GB";
    }
*/

    @Override
    public java.lang.String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", color='" + color + '\'' +
                ", memory=" + memory +
                '}';
    }
/*
    @Override

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Product product = (Product) object;
        return memory == product.memory && java.util.Objects.equals(productName, product.productName) && java.util.Objects.equals(color, product.color);
*/    }
}