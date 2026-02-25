package IF_ELSE;

public class Dog{
    private String name;
    private int age;
    private String color;
    public Dog(){
        System.out.println("Dog is created!");
    }
    public void setName(String varName){
        name = varName;
    }
    public void setAge(int varAge){
        age = varAge;
    }
    public int getAge(){
        System.out.println("Age method="+age);
        return age;
    }
    public static void main(String []args){
        Dog Buldog = new Dog();
        Dog Dvorniazhka = new Dog();
        System.out.println("Age="+Buldog.age);
        Buldog.age=10;
        System.out.println("Age="+Buldog.age);
        Dvorniazhka.setAge(105);
        System.out.println("Age="+Dvorniazhka.age);
        Dvorniazhka.getAge();
    }
}
