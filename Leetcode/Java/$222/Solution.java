package $222;

import datastruc.TreeNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:38 PM 4/8/19.
 */
public class Solution {
    private int count = 0;
    public int countNodes(TreeNode root) {
        helper(root);
        return count;
    }
    private void helper(TreeNode root){
        if (root == null){
            return;
        }
        count++;
        helper(root.left);
        helper(root.right);
    }
}
