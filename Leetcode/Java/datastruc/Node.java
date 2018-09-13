package datastruc;

import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 5:03 PM 2018/09/13.
 */
public class Node {
    public int val;
    public List<Node> children;
    public Node(){}
    public Node(int val, List<Node> children){
        this.val = val;
        this.children = children;
    }
}
