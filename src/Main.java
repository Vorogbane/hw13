import transport.Auto;

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
        Human vladimir = new Human(21, "Владимир", "Казань");
        System.out.println(vladimir.toString());

        Auto granta = new Auto("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "механическая", "седан", "b33ae222", 5, false);
        System.out.println(granta.toString());
        Auto chetyrka = new Auto();
        System.out.println(chetyrka.toString());
        System.out.println(granta.stringCheck());
        granta.changeTires();
        System.out.println(granta.getWinterTire());


        Flower rose = new Flower("Роза", " ", "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower(" ", " ", " ", 15, 5);
        Flower peony = new Flower("Пион", " ", "Англия", 69.90, 1);
        Flower gypsophila = new Flower("Гипсофила", "", "Турция", 19.50, 10);
        System.out.println(rose.toString());

        Flower[] bouquet = new Flower[4];
        bouquet [0] = rose;
        bouquet [1] = chrysanthemum;
        bouquet [2] = peony;
        bouquet [3] = gypsophila;
        Bouquet bouquet1 = new Bouquet (bouquet);
        System.out.println(bouquet1.countTheCost());
        System.out.println(bouquet1.countTheLastingTime());

        Auto.Insurance grantaInsurance = granta.new Insurance("2022-10-24", 10000, "11000222");
        System.out.println(grantaInsurance.checkIfValid());
        System.out.println(grantaInsurance.checkNumber());

    }

}