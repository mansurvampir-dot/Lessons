package FUNCTIONAL_PROG.classWork.task2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Employee> employees = List.of(
                new Employee("Андрей","IT",25.5),
                new Employee("Георгий","IT",500.25),
                new Employee("Наталья","HR",150.0),
                new Employee("Гена","HR",10.5)
        );
        Map<String,List<Employee>> result = employees.stream()
                .collect(Collectors.groupingBy(Employee::department))
                .entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> e.getValue()
                                .stream()
                                .sorted(Comparator.comparingDouble(Employee::salary).reversed())
                                .limit(1)
                                .toList()));
        System.out.println(result);
    }
}
