package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private int productionYear;
    private String country;
    private String colour;
    private double maxSpeed;
    private String fuel;
    public Transport () {
        this.brand = "brand";
        this.model = "model";
        this.productionYear = 2000;
        this.country = "country";
        this.colour = "colour";
        this.maxSpeed = 180;
    }

    public Transport(String brand, String model, int productionYear, String country, String colour, double maxSpeed, String fuel) {
        if (brand == null) {
            brand = "default";
        }
        if (model == null) {
            model = "default";
        }
        if (country == null) {
            country = "default";
        }

        if (productionYear == 0) {
            productionYear = 2000;
        }
        if (colour == null) {
            colour = "default";
        }
        if (fuel == null || fuel.isBlank()||fuel.isEmpty()) {
            this.fuel = "неизвестно";
        }
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.country = country;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getCountry() {
        return country;
    }

    public String getColour() {
        return colour;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setColour(String colour) {
        if (colour != null && !colour.isEmpty() && !colour.isBlank()) {
            this.colour = colour;
        }
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed !=0) {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", country='" + country + '\'' +
                ", colour='" + colour + '\'' +
                ", maxSpeed=" + maxSpeed +
                "Fuel: " + getFuel() +
                '}';
    }
    public abstract String refill ();
}
