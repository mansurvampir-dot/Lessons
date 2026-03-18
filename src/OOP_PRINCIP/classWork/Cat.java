package OOP_PRINCIP.classWork;

public class Cat extends Animal{


    public Cat(String name, int age) {
        super(name, age);
        this.name = name;
    }

    void meow() { System.out.println(name + " мяукает"); }

    @Override
    void makeSound() {
        System.out.println("Мяу");
    }


}
