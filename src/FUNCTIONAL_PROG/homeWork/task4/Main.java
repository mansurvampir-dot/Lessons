package FUNCTIONAL_PROG.homeWork.task4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        String text = "привет, КАК ДЕЛА?, что?. что что делаешь? ,зачем?, почему?";
        Map<String,Long> stream1 = Arrays.stream(text.split("[\\s\\p{Punct}]+")).
                filter(word -> !word.isEmpty()).
                map(String::toLowerCase)
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));
        System.out.println(stream1);

    }
}
