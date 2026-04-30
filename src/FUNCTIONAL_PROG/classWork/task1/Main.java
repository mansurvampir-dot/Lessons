package FUNCTIONAL_PROG.classWork.task1;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<List<Integer>> list = List.of(
                List.of(1,2,3),
                List.of(3,4,5),
                List.of(6,5,4)
        );
        List<Integer> result = list.stream()
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
        System.out.println(result);
    }
}
