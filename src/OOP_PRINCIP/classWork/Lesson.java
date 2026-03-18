package OOP_PRINCIP.classWork;

import java.util.ArrayList;
import java.util.List;

public class Lesson {


    static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.withdraw(250);
//        bankAccount.balance = 100;
//        bankAccount.balance = -33;
        List<String> str = new ArrayList<>();

        Animal cat = new Cat("barsik", 11);
        Animal dog = new Dog("sharik", 10);
//        Animal animal = new Animal("animal", 100);

        Animal.makeAnimalSound(cat);
        Animal.makeAnimalSound(dog);
//        Animal.makeAnimalSound(animal);
    }
}
