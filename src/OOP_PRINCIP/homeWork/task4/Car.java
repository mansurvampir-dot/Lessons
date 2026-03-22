package OOP_PRINCIP.homeWork.task4;

class Car extends Vehicle {

    @Override
    public void start() {
        speed = 60;
        System.out.println("Машина завелась");
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println("Машина остановилась");
    }
}
