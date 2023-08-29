package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {


        Product product1 = new Product();
        //product1.name = "ProductName1";
        //product1.brand = "ProductBrand1";
        //product1.price = 200;
        System.out.println(product1.displayInfo());
        
        Product product2 = new Product("ProductName2", "ProductBrand2", 200);
        double d = product2.getPrice();
        System.out.println(d);
        product2.setPrice(100);
        System.out.println(product2.displayInfo());

        Product product3 = new Product("ProductName3");
        System.out.println(product3.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("Без газа", "ООО Источник", 250, 2.5);
        System.out.println(bottleOfWater1.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Молоко1", "ООО Источник", 300, 1, 2.5);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater("С газом", "ООО Источник", 250, 1);
        System.out.println(bottleOfWater2.displayInfo());

        Product bottleOfWater3 = new BottleOfWater("С газом", "ООО Источник", 150, 0.5);
        System.out.println(bottleOfWater3.displayInfo());

        Product bottleOfMilk2 = new BottleOfMilk("Молоко2", "ООО Молоко", 350, 1, 3.2);
        System.out.println(bottleOfMilk2.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk2);
        products.add(bottleOfWater3);

        VendingMachine vendingMachine = new VendingMachine(products);

    }
    
}
