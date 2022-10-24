package transport;
import java.time.LocalDate;
import java.util.Calendar;
public class Auto {
    public class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(boolean remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }

        public boolean getKeylessAccess() {
            return keylessAccess;
        }

        public void setKeylessAccess(boolean keylessAccess) {
            this.keylessAccess = keylessAccess;
        }
    }

    public class Insurance {
        String validityPeriod;
        double cost;
        String id;

        public Insurance(String validityPeriod, double cost, String id) {
            if (validityPeriod != null && !validityPeriod.isBlank() && !validityPeriod.isEmpty()) {
                this.validityPeriod = validityPeriod;
            }
            this.cost = cost;
            this.id = id;
        }

        public String checkIfValid () {
            String date = LocalDate.now().toString();
            if (!date.equals(validityPeriod)) {
                return "Страховка просрочена";
            }
            return null;
        }

        public String checkNumber () {
            if (id.length() != 9) {
                return "Номер введен неверно";
            }
            return "Номер введен верно";
        }

        public String getValidityPeriod() {
            return validityPeriod;
        }

        public void setValidityPeriod(String validityPeriod) {
            if (validityPeriod != null && !validityPeriod.isBlank() && !validityPeriod.isEmpty()) {
                this.validityPeriod = validityPeriod;
            }
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
    private Key key;
    private Insurance insurance;
    private String brand;
    private String model;
    private Double engineVolume;
    private String colour;
    private int productionYear;
    private String country;
    private String transmission;
    private String bodyType;
    private String plateNumber;
    private int seatsNumber;
    private boolean winterTire;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public String getColour() {
        return colour;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public boolean getWinterTire() {
        return winterTire;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setWinterTire(boolean winterTire) {
        this.winterTire = winterTire;
    }

    public Auto (String brand, String model, Double engineVolume, String colour, int productionYear, String country, String transmission, String bodyType, String plateNumber, int seatsNumber, boolean winterTire) {
        if (brand == null) {
            brand = "default";
        }
        if (model == null) {
            model = "default";
        }
        if (country == null) {
            country = "default";
        }
        if (engineVolume == 0.0) {
            engineVolume = 1.5;
        }
        if (colour == null) {
            colour = "белый";
        }
        if (productionYear == 0) {
            productionYear = 2000;
        }
        if (transmission != null && !transmission.isEmpty()  && !transmission.isBlank()) {
            this.transmission = transmission;
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.colour = colour;
        this.productionYear = productionYear;
        this.country = country;
        this.winterTire = winterTire;
        this.plateNumber = plateNumber;
        this.bodyType = bodyType;
        this.seatsNumber = seatsNumber;
    }
    public Auto (String brand, String model, Double engineVolume, String colour, int productionYear, String country) {
        if (brand == null) {
            brand = "default";
        }
        if (model == null) {
            model = "default";
        }
        if (country == null) {
            country = "default";
        }
        if (engineVolume == 0.0) {
            engineVolume = 1.5;
        }
        if (colour == null) {
            colour = "белый";
        }
        if (productionYear == 0) {
            productionYear = 2000;
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.colour = colour;
        this.productionYear = productionYear;
        this.country = country;
    }
    public Auto () {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            brand = "default";
        }
        if (model == null || model.isBlank() || model.isEmpty()) {
            model = "default";
        }
        if (country == null || country.isBlank() || country.isEmpty()) {
            country = "default";
        }
        if (engineVolume == null || engineVolume == 0.0) {
            engineVolume = 1.5;
        }
        if (colour == null || colour.isBlank() || colour.isEmpty()) {
            colour = "белый";
        }
        if (productionYear == 0) {
            productionYear = 2000;
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.colour = colour;
        this.productionYear = productionYear;
        this.country = country;
    }

    public String stringCheck() {
        String output = null;
        if (plateNumber.matches("[A-Za-z]\\d{3}[A-Za-z]{2}\\d{3}")) {
            output = "Номерной знак введен корректно";
        }
        else {
            output = "Номерной знак введен некорректно";
        }
        return output;
    }
    public void changeTires () {
        winterTire = !winterTire;
    }

    public String toString () {
        return brand + " " + model + " " + engineVolume + " " + "цвет кузова: " + colour + ", " + productionYear + " год производства, страна производства: " + country;
    }


}
