package $199;

import datastruc.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:27 PM 2/25/19.
 */
public class Solution_Recursion {
    public List<Integer> rightSideView(TreeNode root) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        recursion(root, linkedList, 0);
        return linkedList;
    }
    private void recursion(TreeNode root, List<Integer> re, int depth){
        if (root == null){
            return;
        }
        if (re.size() == depth){
            re.add(root.val);
        }
        recursion(root.right, re, depth+1);
        recursion(root.left, re, depth+1);
    }
}
