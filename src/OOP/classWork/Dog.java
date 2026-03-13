package OOP.classWork;

public class Dog {

    private String name;
    private int age;
    private String breed;

    static  int count = 0;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        count++;
    }

    public  Dog(String name, int age){
        this(name, age, "Неизвестно");
    }


    public  Dog(){
        count++;
    }

    void bark() {
        System.out.println(name + " говорит гав");
    }

    void sleep() {
        System.out.println(name + " спит...");
    }

    void printInfo() {
        String name = "";
        int age = 0;
        String breed = "";


        System.out.println("Имя: " + name + ", Возраст: " + age + ", Порода: " + breed);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
