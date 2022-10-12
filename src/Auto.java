public class Auto {
    String brand;
    String model;
    Double engineVolume;
    String colour;
    int productionYear;
    String country;

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
        if (brand == null) {
            brand = "default";
        }
        if (model == null) {
            model = "default";
        }
        if (country == null) {
            country = "default";
        }
        if (engineVolume == null) {
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
    // аналогично надо задать конструкторы со всеми возможными сочетаниями параметров, как я понял, иначе как при создании объекта может появиться null, если создать объект, не задав параметр, будет невозможно?
    public String toString () {
        return brand + " " + model + " " + engineVolume + " " + "цвет кузова: " + colour + ", " + productionYear + " год производства, страна производства: " + country;
    }

}
