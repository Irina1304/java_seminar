package homeworkOOP;

import java.util.ArrayList;
import java.util.List;


public class Program {

    public static void main(String[] args) {
        
        Product product2 = new Product("ProductName2", 100);
        System.out.println(product2.displayInfo());

        Product coffe1 = new Coffee("Кофе черный", 100, 100);
        System.out.println(coffe1.displayInfo());

        Product coffe2 = new Coffee("Кофе черный", 200, 250);
        System.out.println(coffe2.displayInfo());

        Product coffe3 = new Coffee("Кофе черный", 300, 400);
        System.out.println(coffe3.displayInfo());

        Product coffeeWithMilk1 = new CoffeeWithMilk("Кофе с молоком", 250, 150, 100);
        System.out.println(coffeeWithMilk1.displayInfo());

        Product coffeeWithMilk2 = new CoffeeWithMilk("Кофе с молоком", 150, 250, 150);
        System.out.println(coffeeWithMilk2.displayInfo());

        Product tea1 = new Tea("Чай холодный", 160, 10);
        System.out.println(tea1.displayInfo());

        Product tea2 = new Tea("Чай горячий", 150, 90);
        System.out.println(tea2.displayInfo());


        List<Product> products = new ArrayList<>();
        products.add(coffe1);
        products.add(coffe2);
        products.add(coffe3);
        products.add(coffeeWithMilk1);
        products.add(coffeeWithMilk2);
        products.add(tea1);
        products.add(tea2);

        WendingMachine wendingMachine = new WendingMachine(products);
        Coffee coffee = wendingMachine.getCoffee("Кофе черный", 400);
        if (coffee != null){
            System.out.println("Вы купили: ");
            System.out.println(coffee.displayInfo());
        }
        else{
            System.out.println("Такого напитка нет в автомате.");
        }

        WendingMachine wendingMachine1 = new WendingMachine(products);
        Tea tea = wendingMachine1.getTea("Чай горячий", 90);
        if (tea != null){
            System.out.println("Вы купили: ");
            System.out.println(tea.displayInfo());
        }
        else{
            System.out.println("Такого напитка нет в автомате.");
        }


        



    }




    




    
}
