package OOP.homeWork.Task2;

    public class Car {
        private String brand;
        private String model;
        private int year;
        private int speed;

        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.speed =0;
        }

        public void accelerate(int amount) {
            if (amount > 0) {
                this.speed += amount;
                System.out.println("Ускорение Текущая скорость: " + this.speed + " км/ч");
            }
        }

        public void brake(int amount) {
            if (amount > 0) {
                this.speed -= amount;

                if (this.speed < 0) {
                    this.speed = 0;
                }
                System.out.println("Торможение Текущая скорость: " + this.speed + " км/ч");
            }
        }

        public void honk() {
            System.out.println(brand + " " + model + "бииип");
        }
        public int getSpeed() {
            return speed;
        }

        public String getInfo() {
            return brand + " " + model + " (" + year + " год)";
        }
    }
