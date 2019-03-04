package $138;

import java.util.HashMap;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:00 AM 3/4/19.
 */
public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null){
            return null;
        }
        HashMap<Integer,Node> map = new HashMap<>();
        Node node = new Node(), temp = node;
        map.put(head.val, node);
        while (head != null){
            temp.val = head.val;
            if (head.next != null){
                if (map.containsKey(head.next.val)){
                    temp.next = map.get(head.next.val);
                }else {
                    temp.next = new Node();
                    map.put(head.next.val, temp.next);
                }
            }
            if (head.random != null){
                if (map.containsKey(head.random.val)){
                    temp.random = map.get(head.random.val);
                }else {
                    temp.random = new Node();
                    map.put(head.random.val, temp.random);
                }
            }
            head = head.next;
            temp = temp.next;
        }
        return node;
    }
}
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
    // Node(int x) { this.val = x; }
}