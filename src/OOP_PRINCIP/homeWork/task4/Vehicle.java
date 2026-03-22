package OOP_PRINCIP.homeWork.task4;

abstract class Vehicle {
    protected int speed;

    public abstract void start();
    public abstract void stop();
    public int getSpeed() {
        return speed;
    }
}