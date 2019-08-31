package xinlang;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution2 {
    private int capacity = 0;
    private LinkedHashMap<Integer, Integer> hashMap;
    public Solution2(int capacity) {
        this.capacity = capacity;
        hashMap = new LinkedHashMap(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return hashMap.get(key) == null ? -1: hashMap.get(key);
    }

    public void put(int key, int value) {
        hashMap.put(key, value);
    }
}
