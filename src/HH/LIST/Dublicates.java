package HH.LIST;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dublicates {
    public boolean hasDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        boolean dub = list.size()> set.size();
        if (list.size() > set.size()) {
            System.out.println("дубликаты есть");
        } else {
            System.out.println(("дубликатов нет"));
        }
        return dub;
    }
}
