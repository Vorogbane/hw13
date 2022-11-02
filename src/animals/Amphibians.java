package animals;

public class Amphibians extends Animals {
    String food;

    public Amphibians (String name, int age, String livingEnvironment, String food) {
        super (name,age,livingEnvironment);
        this.food = food;
    }
    @Override
    public String eat() {
        return "Пища: " + getFood();
    }

    @Override
    public String dailySleep() {
        return "0";
    }

    @Override
    public String move() {
        return "передвигаются в: " + getLivingEnvironment();
    }
    public void hunt () {
        eat();
    }

    public String getFood() {
        return food;
    }

}
