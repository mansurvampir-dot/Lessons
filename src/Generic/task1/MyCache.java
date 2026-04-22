package Generic.task1;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyCache<K, V> extends LinkedHashMap<K,V> {
    private final int capacity;

    public MyCache(int capacity){
        super(capacity,75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest){
        return size() > capacity;
    }
}