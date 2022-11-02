package animals;

public abstract class Mammals extends Animals {
    private int speed;

    public Mammals (String name, int age, String livingEnvironment, int speed) {
        super(name,age,livingEnvironment);
        this.speed = speed;
    }
    public abstract String walk();

    public int getSpeed() {
        return speed;
    }
}
