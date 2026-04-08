package OOP_PRINCIP.homework2.task10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Миша", 25));
        list.add(new Person("Анна", 20));
        list.add(new Person("Иван", 30));

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age);
            }
        });

        System.out.println(list);

    }
}
