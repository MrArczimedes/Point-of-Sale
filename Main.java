import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;


public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ProductBarCode = "";
        ArrayList<Product> Produkty=ProductGenerator.generateProducts();
        ProductList productList=new ProductList(Produkty);
        Recipt recipt = new Recipt();
        Product aktualny;
        System.out.println("Sciaga produktow");
        for (Product p:Produkty)
        {
            System.out.println(p.getName()+" "+p.getPrice()+" "+p.getBarCode());
        }
        while (true) {
            System.out.println("Podaj kod kreskowy");
            ProductBarCode = br.readLine();
            if (ProductBarCode.equals("exit"))
            {
                break;
            }
            if (!ProductBarCode.matches("[\\w \\d]+"))
            {

                LCDDisplay.display("Invalid bar-code");
                continue;
            }

            aktualny=productList.getByBarCode(ProductBarCode);
            if (aktualny==null)
            {
                LCDDisplay.display("Product not found");
            }
            else
            {
                String tmp = "Name: "+ aktualny.getName() + " Price: " +aktualny.getPrice();
                LCDDisplay.display(tmp);
                recipt.addProduct(aktualny);
            }
        }
        Printer.print(recipt.generateRecipt());
        LCDDisplay.display(String.valueOf(recipt.calculateTotalCost()));


    }
}
