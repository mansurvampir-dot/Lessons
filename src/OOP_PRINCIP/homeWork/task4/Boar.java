package OOP_PRINCIP.homeWork.task4;

class Boar extends Vehicle {

    @Override
    public void start() {
        speed = 40;
        System.out.println("Лодка плавает");
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println("Лодка останавливается");
    }
}