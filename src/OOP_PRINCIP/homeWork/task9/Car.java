package OOP_PRINCIP.homeWork.task9;

class Car {
    private Engine engine = new Engine();

    void startCar() {
        engine.start();
        System.out.println("Машина поехала");
    }
}
