package OOP.classWork;

public class Lesson {

    public static void main(String[] args) {
        String dogName = "Шарик";
        int dogAge = 3;
        String dogBreed = "Дворняга";


        String dogName2 = "Шарик2";
        int dogAge2 = 6;
        String dogBreed2 = "Пикинес";


        Dog sharik = new Dog("Шарик", 3, "Дворняга");

        Dog barsik = new Dog();
        barsik.setName("Барсика");
        barsik.setAge(6);
        barsik.setBreed("Пикинес");


        sharik.bark();
        sharik.sleep();
        sharik.printInfo();

        System.out.println(Dog.count);


//        printInfo(barsik);

//        barsik.bark();
//        barsik.sleep();
//        barsik.printInfo();
    }


    static void printInfo(Dog dog){
        System.out.println("Имя: " + dog.getName() + ", Возраст: " + dog.getAge() + ", Порода: " + dog.getBreed());
    }

    public static void printDog(String dogName, int dogAge, String dogBreed){
        System.out.println(dogName + ", " + dogAge + ", " + dogBreed);
    }
}
