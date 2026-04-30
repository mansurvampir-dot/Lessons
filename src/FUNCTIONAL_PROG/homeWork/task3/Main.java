package FUNCTIONAL_PROG.homeWork.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Собака", "кошка", "медоед");
        Optional<String> longest=list.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(longest);
    }
}
