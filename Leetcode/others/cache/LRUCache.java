package cache;

import java.util.HashMap;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:03 AM 1/21/19.
 *
 * TODO: Achieving an timeout replacing strategy
 *  https://github.com/crossoverJie/JCSprout/blob/master/src/main/java/com/crossoverjie/actual/LRUAbstractMap.java
 *  https://segmentfault.com/a/1190000014229168
 */
public class LRUCache<K, V> {
    private final HashMap<K, Node> hashMap = new HashMap<>();

    private final int capacity;

    public LRUCache(int capacity){
        if (capacity <= 0){
            throw new IllegalArgumentException("capacity couldn't be less than zero!");
        }
        head.next = tail;
        tail.pre = head;
        this.capacity = capacity;
    }
    private final Node head = new Node();
    private final Node tail = new Node();
    public V get(K key){
        if (hashMap.containsKey(key)){
            Node temp = hashMap.get(key);
            removeNode(temp);
            addHead(temp);
            return temp.value;
        }
        return null;
    }
    public V put(K key, V value){
        if (hashMap.containsKey(key)){
            Node temp = hashMap.get(key);
            temp.value = value;
            removeNode(temp);
            addHead(temp);
            return value;
        }
        if (hashMap.size() >= capacity){
            removeNode(tail.pre);
        }
        Node node = new Node(key, value);
        hashMap.put(key, node);
        addHead(node);
        return value;
    }
    private void addHead(Node n){
        n.next = head.next;
        head.next.pre = n;
        head.next = n;
        n.pre = head;
        hashMap.put(n.key, n);
    }
    private void removeNode(Node n){
        n.pre.next = n.next;
        n.next.pre = n.pre;
        hashMap.remove(n.key);
    }
    public void print(){
        Node temp = head;
        while (temp.next != tail){
            temp = temp.next;
            System.out.println("Key:" + temp.key + "   Value:" + temp.value);
        }
    }
    class Node {
        Node(K key, V value){
            this.key = key;
            this.value = value;
        }
        Node(){}
        K key;
        V value;
        Node pre;
        Node next;
    }
}

