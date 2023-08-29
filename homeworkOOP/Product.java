package homeworkOOP;

public class Product {

    protected String name; // Наименование
    protected double price; // Стоимость


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    
    public Product(String name, double price) {
        checkName(name);
        if (price < 100){
            throw new RuntimeException("Некорректная цена товара");
        }

        this.price = price;
    }


    private void checkName(String name){
        if (name == null || name.length() < 3){
            this.name = "Noname";
        }
        else {
            this.name = name;
        }
    }


    public String displayInfo(){
        return String.format("%s - %.2f", name, price);
    }




    
    
}
