
public class Stock {

    String produit1;
    String produit2;
    String produit3;


    public Stock(String produit1, String produit2, String produit3) {

        this.produit1=produit1;
        this.produit2=produit2;
        this.produit3=produit3;


    }

    public String getProduit1() {
        return produit1;
    }

    public void setProduit1(String produit1) {
        this.produit1 = produit1;
    }

    public String getProduit2() {
        return produit2;
    }

    public void setProduit2(String produit2) {
        this.produit2 = produit2;
    }

    public String getProduit3() {
        return produit3;
    }

    public void setProduit3(String produit3) {
        this.produit3 = produit3;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "produit1='" + produit1 + '\'' +
                ", produit2='" + produit2 + '\'' +
                ", produit3='" + produit3 + '\'' +
                '}';
    }
}
