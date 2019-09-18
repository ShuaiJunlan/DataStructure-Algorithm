package $530;

import datastruc.TreeNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:24 PM 9/18/19.
 *
 */
public class Solution {
    private int minDiff = Integer.MAX_VALUE;
    private TreeNode prev;
    public int getMinimumDifference(TreeNode root){
        inorder(root);
        return minDiff;
    }
    private void inorder(TreeNode root){
        if (root == null){
            return;
        }
        inorder(root.left);
        if (prev != null){
            minDiff = Math.min(minDiff, root.val-prev.val);
        }
        prev = root;
        inorder(root.right);
    }
}
