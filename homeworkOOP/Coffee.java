package homeworkOOP;

public class Coffee extends Product {

    protected double volume; //объем



 public double getVolume() {
        return volume;
    }


public Coffee(String name, double price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Кофе] %s - %.2f - v: %.2f", name, price, volume);
    }

    


    
}
