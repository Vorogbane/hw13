package animals;

public abstract class Animals {
    private String name;
    private int age;
    private String livingEnvironment;

    public abstract String eat();
    public abstract String dailySleep();
    public abstract String move();

    public Animals(String name, int age, String livingEnvironment) {
        this.name = name;
        this.age = age;
        this.livingEnvironment = livingEnvironment;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }
}
