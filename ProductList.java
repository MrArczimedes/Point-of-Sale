import java.util.ArrayList;

public class ProductList {
    private ArrayList<Product> ProductList;

    public ProductList(ArrayList<Product> ProductList) {
        this.ProductList = ProductList;
    }

    public Product getByBarCode(String BarCodeToSearch) { //Zakladam ze nie ma powtorek.
        for (Product prod : this.ProductList) {
            if (prod.getBarCode().equals(BarCodeToSearch)) {
                return prod;
            }
        }
        return null;
    }

    public void addProduct(Product prodToAdd) {
        this.ProductList.add(prodToAdd);
    }

}
