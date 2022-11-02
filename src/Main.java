import animals.*;
import transport.Auto;
import transport.Bus;
import transport.Train;

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

        Auto granta = new Auto("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "механическая", "седан", "b33ae222", 5, false, 180, "бензин");
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

        //Поезд «Ласточка», модель B-901, 2011 год выпуска в России, скорость передвижения — 301 км/ч, отходит от Белорусского вокзала и следует до станции Минск-Пассажирский. Цена поездки — 3500 рублей, в поезде 11 вагонов.
        //Поезд «Ленинград», модель D-125, 2019 год выпуска в России, скорость передвижения — 270 км/ч, отходит от Ленинградского вокзала и следует до станции Ленинград-Пассажирский. Цена поездки — 1700 рублей, в поезде 8 вагонов.
        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", "", 301, "Солярка", 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", "", 270, "солярка", 1700, 0, "Ленинградский возкал", "Ленинград-Пассажирский", 8);
        System.out.println(lastochka.toString());
        System.out.println(leningrad.toString());

        Bus maz = new Bus("MAZ", "MAZ-232", 2015, "Россия", "желтый", 150, "дизель");
        Bus liaz = new Bus("LiAZ", "LiAZ-4292", 2015, "Россия", "Синий", 150, "дизель");
        System.out.println(maz.toString());
        System.out.println(liaz.toString());

        Herbivores gazelle = new Herbivores("Paul", 3, "savannah", 100, "grass");
        Herbivores giraffe = new Herbivores ("Ben", 10, "savannah", 40, "leaves");
        Herbivores horse = new Herbivores ("Julius", 5, "land", 90, "grass");
        Carnivores hyena = new Carnivores("Volodimir", 3,"savannah",60, "carrion");
        Carnivores tiger = new Carnivores("Isaak", 5, "land", 100, "meat");
        Carnivores bear = new Carnivores("Dobrynya", 2, "forest", 80, "meat and vegetables");
        Amphibians frog = new Amphibians("Claus", 1, "land and water", "insects");
        Amphibians grassSnake = new Amphibians("Augustus", 1, "land and water", "meat");
        Flightless_birds peacock = new Flightless_birds("Sean", 3, "land", "vegetables", "walking");
        Flightless_birds penguin = new Flightless_birds("Anton", 3, "land and sea", "fish", "walking and swimming" );
        Flightless_birds dodo = new Flightless_birds("Vasil", 2, "land", "vegetables", "walking");
        Flying_birds seagull = new Flying_birds("Sam", 4, "land and sea", "fish", "flying");
        Flying_birds albatross = new Flying_birds("Frodo", 6, "land and sea", "fish", "flying");
        Flying_birds falcon = new Flying_birds("Gimli", 2, "land", "meat", "flying");
        System.out.println(falcon.toString());
        System.out.println(falcon.eat());

    }

}