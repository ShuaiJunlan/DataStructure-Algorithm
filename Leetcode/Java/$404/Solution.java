package $404;

import datastruc.TreeNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 11:30 AM 9/17/19.
 */
public class Solution {
    private int leftSum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        leftSum = 0;
        help(root);
        return leftSum;

    }
    private void help(TreeNode root){
        if (root == null){
            return;
        }
        if (root.left != null && root.left.left == null && root.left.right == null){
            leftSum += root.left.val;
        }
        help(root.left);
        help(root.right);
    }
}
