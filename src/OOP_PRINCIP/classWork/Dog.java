package OOP_PRINCIP.classWork;

public class Dog extends  Animal{

    void bark() { System.out.println(name + " лает"); }


    public Dog(String name, int age) {
        System.out.println("Создали собаку");
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Гав");
    }
}
