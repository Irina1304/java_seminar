package homeworkOOP;

public class Tea extends Product {

    private double temperature;

        public double getTemperature() {
        return temperature;
    }

        public Tea(String name, double price, double temperature) {
        super(name, price);
        this.temperature = temperature;

    }


    @Override
    public String displayInfo() {
        return String.format("[Чай] %s - %.2f - %.1f", name, price, temperature);
    }




    
}
