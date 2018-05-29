import java.util.ArrayList;

public class ProductGenerator {
    public static ArrayList<Product> generateProducts()

    {
        Product Mleko = new Product("Mleko", "1234567891234", 2.99);
        Product Chleb = new Product("Chleb", "1234567892345", 1.59);
        Product Woda = new Product("Woda", "2345678912345", 0.99);
        Product Sok = new Product("Sok", "4567891234567", 3.19);
        ArrayList<Product> prod= new ArrayList<>();
        prod.add(Mleko);
        prod.add(Chleb);
        prod.add(Woda);
        prod.add(Sok);
        return prod;

    }

}
