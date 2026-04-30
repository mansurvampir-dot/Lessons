package FUNCTIONAL_PROG.homeWork.task2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void  main(String[] args){
        List<String> list = List.of("Аня", "Боря", "Алексей", "Борис", "Анна");
        Map<Character,List<String>> sortedList = list.stream().
                collect(Collectors.groupingBy(name->name.charAt(0)));
        System.out.println(sortedList);
    }
}
