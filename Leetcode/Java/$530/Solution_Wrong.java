package $530;

import datastruc.TreeNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 6:52 PM 9/18/19.
 */
public class Solution_Wrong {
    private int minValue = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if (root == null){
            return 0;
        }
        helper(root);
        return minValue;
    }
    private void helper(TreeNode root){
        if (root == null){
            return;
        }
        if (root.left != null){
            minValue = Math.min(minValue, Math.abs(root.left.val - root.val));
        }
        if (root.right != null){
            minValue = Math.min(minValue, Math.abs(root.right.val - root.val));
        }
        helper(root.left);
        helper(root.right);
    }
}
