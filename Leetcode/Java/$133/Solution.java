package $133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:10 PM 3/3/19.
 *
 * depth first
 */
public class Solution {
    private final HashMap<Integer, Node> hashMap = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null){
            return null;
        }
        return clone(node);
    }
    private Node clone(Node node){
        if (hashMap.containsKey(node.val)){
            return hashMap.get(node.val);
        }
        Node node1 = new Node(node.val, new ArrayList<>());
        hashMap.put(node.val, node1);
        for (Node t : node.neighbors){
            node1.neighbors.add(clone(t));
        }
        return node1;
    }
}
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}