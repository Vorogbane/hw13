public class Bouquet {
    Flower [] bouquet;
    public Bouquet (Flower [] bouquet) {
     this.bouquet = bouquet;
    }
    public String countTheCost () {
        String output = null;
        double sum = 0;
        for (int i = 0; i < bouquet.length; i++) {
            if (bouquet[i] != null) {
                sum += bouquet[i].getCost();
            }
        }
        sum = sum * 1.10;
    output = "Стоимость букета: " + String.format("%.2f", sum);
    return output;
    }
    public String countTheLastingTime () {
        String output = null;
        int lastingTime = 1000;
        for (int i = 0; i < bouquet.length; i++) {
            if (bouquet[i] != null && bouquet[i].getLifeSpan() < lastingTime) {
                lastingTime = bouquet[i].getLifeSpan();
            }
        }
        output = "Букет продержится " + lastingTime + " дней";
        return output;
    }
}

