package transport;

public class Train extends Transport {
    private double costOfTrip;
    private int timeOfTrip;
    private String departureStation;
    private String arrivalStation;
    private int amountOfCarriages;

    public Train (String brand, String model, int productionYear, String country, String colour, double maxSpeed, String fuel) {
        super (brand, model, productionYear, country, colour,maxSpeed, fuel);
        this.costOfTrip = 1000;
        this.timeOfTrip = 10;
        this.departureStation = "Default";
        this.arrivalStation = "Default";
        this.amountOfCarriages = 10;
    }
    public Train (String brand, String model, int productionYear, String country, String colour, double maxSpeed, String fuel, double costOfTrip, int timeOfTrip, String departureStation, String arrivalStation, int amountOfCarriages) {
        super (brand, model, productionYear, country, colour,maxSpeed, fuel);
        this.costOfTrip = costOfTrip;
        this.timeOfTrip = timeOfTrip;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.amountOfCarriages = amountOfCarriages;
    }

    @Override
    public String toString() {
        return "Train{" +
                "costOfTrip=" + costOfTrip +
                ", timeOfTrip=" + timeOfTrip +
                ", departureStation='" + departureStation + '\'' +
                ", arrivalStation='" + arrivalStation + '\'' +
                ", amountOfCarriages=" + amountOfCarriages +
                '}';
    }

    @Override
    public String refill() {
        return "Топливо: " + getFuel();
    }
}
