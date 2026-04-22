package Generic.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Util {
    public static <T, R> List<R> transform(List<T> list, Function<T, R> mapper){
        List<R> results = new ArrayList<>();
        for (T i : list) {
            results.add(mapper.apply(i));
        }
        return results;
    }
}
