package FUNCTIONAL_PROG.homeWork.task5;

import java.util.stream.Collector;
import java.util.stream.Stream;

public class Main {
    static void main(String[] args) {
        Collector<Double, Stats[], Stats> statsCollector = Collector.of(
                () -> new Stats[]{Stats.empty()},
                (a, c) -> a[0] = a[0].merge(c),
                (a, b) -> {
                    a[0] = a[0].combine(b[0]);
                    return a;
                },
                a -> a[0]
        );
        Stats stats = Stream.of(3.0, 1.0, 4.0, 1.0, 5.0, 9.0)
                .collect(statsCollector);

        System.out.println("count: " + stats.count());
        System.out.println("sum:   " + stats.sum());
        System.out.println("min:   " + stats.min());
        System.out.println("max:   " + stats.max());
        System.out.println("avg:   " + stats.avg());
    }
}
