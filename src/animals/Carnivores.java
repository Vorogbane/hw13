package animals;

public class Carnivores extends Mammals{
    String food;

    public Carnivores (String name, int age, String livingEnvironment, int speed, String food) {
        super(name,age,livingEnvironment, speed);
        this.food = food;
    }

    @Override
    public String eat() {
        return "Пища: " + getFood();
    }

    @Override
    public String dailySleep() {
        return "8-12";
    }

    @Override
    public String move() {
        return "передвигаются в: " + getLivingEnvironment();
    }

    @Override
    public String walk() {
        return "Скорость передвижения: " + getSpeed();
    }

    public String getFood() {
        return food;
    }
    public void hunt () {
        eat();
    }
}
