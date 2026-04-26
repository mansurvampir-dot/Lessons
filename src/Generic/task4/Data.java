package Generic.task4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Data {
    Map<User, Set<Item>> map = new HashMap<>();

    void add(User user, Item item) {
        map.computeIfAbsent(user, k -> new HashSet<>()).add(item);
    }

    Set<Item> get(User user) {
        return map.getOrDefault(user, Set.of());
    }
}
