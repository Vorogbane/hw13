import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Human maxim = new Human(35, "Максим", "Минск", "Бренд-менеджер");
        System.out.println(maxim.toString());
        Human ann = new Human(29, "Аня", "Москва", "Методист образовательных программ");
        Human kate = new Human(28, "Катя", "Калининград", "Продакт-менеджер");
        Human artem = new Human(27, "Артем", "Москва", "Директор по развитию бизнеса");
        System.out.println(ann.toString());
        System.out.println(kate.toString());
        System.out.println(artem.toString());

        Auto granta = new Auto("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        System.out.println(granta.toString());
        Auto chetyrka = new Auto();
        System.out.println(chetyrka.toString());

    }

}