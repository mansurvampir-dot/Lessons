package OOP_PRINCIP.homeWork.task6;

public class Fish extends Anime implements Swimmable{
    public Fish(String name){
        super(name);

    }
    @Override
    public void swim() {
        System.out.println(getName() + " плывёт.");
    }
}
