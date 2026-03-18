package OOP_PRINCIP.classWork;

public abstract class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() { System.out.println(name + " ест"); }
    void sleep() { System.out.println(name + " спит"); }

    abstract void makeSound();

    public static void makeAnimalSound(Animal animal){
        animal.makeSound();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
