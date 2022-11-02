package transport;

public class Bus extends Transport {

    public Bus (String brand, String model, int productionYear, String country, String colour, double maxSpeed, String fuel) {
        super(brand, model, productionYear, country, colour, maxSpeed, fuel);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String refill() {
        return "Топливо: " + getFuel();
    }
}
