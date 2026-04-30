package FUNCTIONAL_PROG.homeWork.task1;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> arr = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(arr);
    }
}
