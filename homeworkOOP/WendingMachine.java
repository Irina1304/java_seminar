package homeworkOOP;

import java.util.List;

public class WendingMachine {

    private List<Product> products;

    public WendingMachine(List<Product> products) {
        this.products = products;
    }

    public Coffee getCoffee(String name, double volume){
        for (Product product: products){
            if (product instanceof Coffee){
                Coffee coffee = (Coffee)product;
                if (product.getName().equals(name) && coffee.getVolume() == volume){
                    return coffee;

                }
            }
        }
        return null;
    }


        public Tea getTea(String name, int temperature){
        for (Product product: products){
            if (product instanceof Tea){
                Tea tea = (Tea)product;
                if (product.getName().equals(name) && tea.getTemperature() == temperature){
                    return tea;

                }
            }
        }
        return null;
    }


    
}
