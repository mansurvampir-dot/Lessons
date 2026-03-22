package OOP_PRINCIP.homeWork.task4;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        Vehicle boar = new Boar();

        car.start();
        System.out.println("Скорость: " + car.getSpeed());
        car.stop();

        bicycle.start();
        System.out.println("Скорость: " + bicycle.getSpeed());
        bicycle.stop();

        boar.start();
        System.out.println("Скорость: " + boar.getSpeed());
        boar.stop();
    }
}