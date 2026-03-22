package OOP_PRINCIP.homeWork.task6;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck("Кряк");
        Fish fish = new Fish("Немо");
        Penguin penguin = new Penguin("Пингвинёнок");

        System.out.println("Утка");
        duck.walk();
        duck.swim();
        duck.fly();

        System.out.println("\nРыба");
        fish.swim();

        System.out.println("\nПингвин ");
        penguin.walk();
        penguin.swim();
    }
}