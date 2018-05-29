public class Product {
    private String name;
    private String BarCode;
    private double price;

    public Product(String name, String BarCode, double price) {
        this.name = name;
        this.BarCode = BarCode;
        this.price = price;
    }

    String getName() {
        return name;
    }

    String getBarCode() {
        return BarCode;
    }

    double getPrice() {
        return price;
    }


}