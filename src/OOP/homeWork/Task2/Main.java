package OOP.homeWork.Task2;

public class Main {
    public static void main(String[] args){
        Car Mycar = new Car("Mersedes","amg",5);
        System.out.println("Автомобиль: " + Mycar.getInfo());

        Mycar.honk();
        Mycar.accelerate(50);
        Mycar.brake(20);
        Mycar.brake(100);

        System.out.println("Итоговая скорость: " + Mycar.getSpeed());
    }
}
