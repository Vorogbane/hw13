package animals;

public class Flightless_birds extends Birds{
    String motionType;
    String food;

    public Flightless_birds (String name, int age, String livingEnvironment, String food, String motionType) {
        super (name,age,livingEnvironment);
        this.food = food;
        this.motionType= motionType;
    }

    public String eat() {
        return "Пища: " + getFood();
    }

    @Override
    public String dailySleep() {
        return "0-20";
    }

    @Override
    public String move() {
        return "передвигаются в: " + getLivingEnvironment();
    }

    public String getFood() {
        return food;
    }

    public String getMotionType() {
        return motionType;
    }
    public String walk() {
        return getMotionType();
    }
}
