package $117;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 5:05 PM 3/2/19.
 */
public class Solution_Optimize {
    public Node connect(Node root) {
        if (root == null){
            return null;
        }
        Node head = root;
        while (root != null){
            Node tempChild  = new Node();
            Node currentNode = tempChild;
            while (root != null){
                if (root.left != null){
                    currentNode.next = root.left;
                    currentNode = currentNode.next;
                }
                if (root.right != null){
                    currentNode.next = root.right;
                    currentNode = currentNode.next;
                }
                root = root.next;
            }
            root = tempChild.next;
        }
        return head;
    }
}
