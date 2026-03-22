package OOP_PRINCIP.homeWork.task6;


class Penguin extends Anime implements Walkable, Swimmable {
    public Penguin(String name) {
        super(name);
    }
    @Override
    public void walk() {
        System.out.println(getName() + "идёт.");
    }
    @Override
    public void swim() {
        System.out.println(getName() + " плывёт.");
    }}
