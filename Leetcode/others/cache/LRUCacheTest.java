package cache;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:38 AM 1/21/19.
 */
public class LRUCacheTest {
    public static void main(String[] args) {
        // LRUCache<Integer, String> lruCache = new LRUCache<>(3);
        // lruCache.put(1, "a");
        // lruCache.put(2, "b");
        // lruCache.put(3, "d");
        // lruCache.put(1, "a");
        // lruCache.put(4, "f");
        // System.out.println(lruCache.get(2));

        test1();

    }
    public static void test1(){
        LRUCache<String, Integer> lruCacheOnLinkedAndMap = new LRUCache<>(6);
        lruCacheOnLinkedAndMap.put("s", 1);
        lruCacheOnLinkedAndMap.put("h", 2);
        lruCacheOnLinkedAndMap.put("u", 3);
        lruCacheOnLinkedAndMap.put("a", 8);
        lruCacheOnLinkedAndMap.put("i", 4);
        lruCacheOnLinkedAndMap.put("j", 7);
        lruCacheOnLinkedAndMap.put("u", 1);
        lruCacheOnLinkedAndMap.put("s", 10);
        lruCacheOnLinkedAndMap.print();
    }
}
