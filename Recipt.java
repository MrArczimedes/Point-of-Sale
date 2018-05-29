import java.util.ArrayList;

public class Recipt {
    private ArrayList<Product> productList;
    public Recipt()
    {
        this.productList=new ArrayList<>();
    }
    public void addProduct(Product productToAdd)
    {
        this.productList.add(productToAdd);
    }
    public String generateRecipt()
    {
        String result= "";
        double totalCost=0;
        for (Product product:this.productList)
        {
            result+="Name: "+ product.getName() + " Price "+ String.valueOf(product.getPrice())+"\n";
            totalCost+=product.getPrice();
        }
        result+="Total cost: "+ String.format( "%.2f", totalCost)+"\n";
        return result;
    }
    public double calculateTotalCost()
    {

        double totalCost=0;
        for (Product product:this.productList)
        {
            totalCost+=product.getPrice();
        }
        return totalCost;
    }

}
