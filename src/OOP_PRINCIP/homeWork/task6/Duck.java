package OOP_PRINCIP.homeWork.task6;

public class Duck extends Anime implements Flyable,Swimmable,Walkable  {
    public Duck(String name) {
        super(name);
    }



        @Override
    public void fly() {
        System.out.println(getName() + " летит.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плывёт.");
    }

    @Override
    public void walk() {
        System.out.println(getName() + "идёт.");
    }
}
