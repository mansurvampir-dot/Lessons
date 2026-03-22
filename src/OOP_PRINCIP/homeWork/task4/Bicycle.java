package OOP_PRINCIP.homeWork.task4;

    class Bicycle extends Vehicle {

        @Override
        public void start() {
            speed = 15;
            System.out.println("Велосипед едет");
        }

        @Override
        public void stop() {
            speed = 0;
            System.out.println("Велосипед остановился");
        }
    }
