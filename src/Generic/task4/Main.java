package Generic.task4;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Миша");
        User u2 = new User("Аня");
        User u3 = new User("Даша");

        Item i1 = new Item("Телефон");
        Item i2 = new Item("Чехол");
        Item i3 = new Item("Зарядка");
        Item i4 = new Item("Наушники");

        Data data = new Data();

        data.add(u1, i1);
        data.add(u1, i2);
        data.add(u1, i3);

        data.add(u2, i1);
        data.add(u2, i2);
        data.add(u2, i4);

        data.add(u3, i1);
        data.add(u3, i3);
        data.add(u3, i4);

        Service s = new Service(data);
        System.out.println(u1);
        System.out.println(s.getRec(u1));
        System.out.println(u2);
        System.out.println(s.getRec(u2));
        System.out.println(u3);
        System.out.println(s.getRec(u3));
    }
}
