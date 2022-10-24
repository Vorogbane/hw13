import java.util.Calendar;
public class Human {
    private int birthDate;
    private String name;
    private String town;
    private String position;

    public Human (int birthDate, String name, String town) {
        Calendar cal = Calendar.getInstance();
        if(cal.get(Calendar.YEAR) - birthDate <= 0) {
            birthDate = 0;
        }
        if (name == null) {
            name = "информация не указана";
        }
        if (town == null) {
            town = "информация не указана";
        }
        if (position == null) {
            position = "информация не указана";
        }
        this.birthDate = cal.get(Calendar.YEAR) - birthDate;
        this.name = name;
        this.town = town;
    }
    public Human (int birthDate, String name, String town, String position) {
        Calendar cal = Calendar.getInstance();
        this.birthDate = cal.get(Calendar.YEAR) - birthDate;
        this.name = name;
        this.town = town;
        this.position = position;
    }
    public String getTown () {
        return this.town;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public String getPosition() {
        return position;
    }

    public void setBirthDate(int birthDate) {
        if (birthDate >= 0) {
            this.birthDate = birthDate;
        } else {
            this.birthDate = 0;
        }
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank() ) {
            this.town = town;
        } else {
            this.town = "информация не указана";
        }
    }

    public String toString () {
        if (this.getPosition() != null && !this.getPosition().isEmpty() && !this.getPosition().isBlank()){
            return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + birthDate + " году. Я работаю на должности " + position + ". Будем знакомы!";
        } else {
            return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + birthDate + " году. Будем знакомы!";
        }
    }

}
