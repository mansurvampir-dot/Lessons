package Generic.task4.aiTask;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Service {
    Data data;

    Service(Data data) {
        this.data = data;
    }

    Set<Item> getRec(User user) {
        Set<Item> my = data.get(user);
        Set<Item> res = new HashSet<>();

        for (Map.Entry<User, Set<Item>> e : data.map.entrySet()) {
            User other = e.getKey();
            Set<Item> items = e.getValue();

            if (other.equals(user)) continue;

            Set<Item> common = new HashSet<>(my);
            common.retainAll(items);

            if (common.size() >= 2) {
                for (Item it : items) {
                    if (!my.contains(it)) {
                        res.add(it);
                    }
                }
            }
        }

        return res;
    }
}
