package $117;


import java.util.LinkedList;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 4:49 PM 3/2/19.
 */
public class Solution {
    public Node connect(Node root) {
        if (root == null){
            return null;
        }
        LinkedList<Node> linkedList = new LinkedList<>();
        linkedList.add(root);
        while (!linkedList.isEmpty()){
            Node temp, pre=null;
            LinkedList<Node>  nodes = new LinkedList<>();
            while ((temp = linkedList.poll()) != null){
                if (temp.left != null){
                    nodes.add(temp.left);
                }
                if (temp.right != null){
                    nodes.add(temp.right);
                }
                if (pre != null){
                    pre.next = temp;
                }
                pre = temp;
            }
            linkedList = nodes;
        }
        return root;
    }
}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};