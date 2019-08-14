package $460;

import java.util.HashMap;
import java.util.LinkedHashSet;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 6:47 PM 8/14/19.
 */
public class LFUCache {
    private int capacity;
    private HashMap<Integer, Integer> counts;
    private HashMap<Integer, Integer> values;
    private HashMap<Integer, LinkedHashSet<Integer>> lists;

    private int min = -1;
    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.counts = new HashMap<>(capacity);
        this.values = new HashMap<>(capacity);
        lists = new HashMap<>();

    }

    public int get(int key) {
        if (!values.containsKey(key)){
            return -1;
        }
        int val = values.get(key);
        put(key, val);
        return val;

    }

    public void put(int key, int value) {
        if (capacity == 0){
            return;
        }
        if (values.containsKey(key)){
            values.put(key, value);
            int count = counts.get(key);
            lists.get(count).remove(key);
            counts.put(key, count+1);
            if (lists.get(count+1) == null){
                LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
                hashSet.add(key);
                lists.put(count+1, hashSet);
            }else {
                lists.get(count+1).add(key);
            }
            if (min == count && lists.get(count).size() == 0){
                min++;
            }
            return;
        }
        if (values.size() == capacity){
            int evit = lists.get(min).iterator().next();
            lists.get(min).remove(evit);
            values.remove(evit);
            counts.remove(evit);
        }

        counts.put(key, 1);
        values.put(key, value);
        min = 1;
        if (lists.get(min) == null){
            LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
            hashSet.add(key);
            lists.put(min, hashSet);
        }else {
            lists.get(min).add(key);
        }
    }

    public static void main(String[] args) {
        LFUCache lfuCache = new LFUCache(0);
        lfuCache.put(0, 0);
        System.out.println(lfuCache.get(0));
    }
}
