package Generic.task1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cashe<K, V> {
    private final int capacity;
    private final Map<K, V> storage;

    public Cashe(int capacity){
        this.capacity = capacity;
        this.storage = new LinkedHashMap<K, V>(capacity,75f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest){
                return size() > capacity;
            }
        };
    }
}
