
public class Flower {
    private String flowerName;
    private String flowerColour;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower (String flowerName, String flowerColour, String country, double cost, int lifeSpan) {
        if (flowerName != null && !flowerName.isEmpty() && !flowerName.isBlank()) {
            this.flowerName = flowerName;
        } else {
            this.flowerName = "default";
        }
        if (flowerColour != null && !flowerColour.isEmpty() && !flowerColour.isBlank()) {
            this.flowerColour = flowerColour;
        } else {
            this.flowerColour = "белый";
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost > 0) {
            this.cost = cost;
        } else if ( cost < 0) {
            this.cost = Math.abs(cost);
        } else {
            this.cost = 1;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else if (lifeSpan < 0){
            this.lifeSpan = Math.abs(lifeSpan);
        } else {
            this.lifeSpan = 3;
        }
    }
    public String getFlowerColour () {
        return flowerColour;
    }

    public double getCost() {
        return cost;
    }

    public String getCountry() {
        return country;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public void setFlowerColour(String flowerColour) {
        if (flowerColour != null && !flowerColour.isEmpty() && !flowerColour.isBlank()) {
            this.flowerColour = flowerColour;
        } else {
            this.flowerColour = "белый";
        }
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else if (cost < 0) {
            this.cost = Math.abs(cost);
        } else {
            this.cost = 1;
        }
    }
    public String toString () {
        return flowerName + ", цвет:" + flowerColour + ", страна: " + country + ", стоиммость: " + cost + ", срок стояния: " + lifeSpan;
    }
}
