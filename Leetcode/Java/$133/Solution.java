package $133;

import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:10 PM 3/3/19.
 */
public class Solution {
}
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};