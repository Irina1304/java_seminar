package homeworkOOP;

public class CoffeeWithMilk extends Coffee {

    private double milk; // объем молока

    public double getMilk() {
        return milk;
    }

    public CoffeeWithMilk(String name, double price, double volume, double milk) {
    super(name, price, volume);
    this.milk = milk;
    }

    @Override
    public String displayInfo() {
        return String.format("[Кофе] %s - %.2f - v: %.2f, m: %.2f", name, price, volume, milk);
    }

}
