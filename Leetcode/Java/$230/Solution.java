package $230;

import datastruc.TreeNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 11:32 AM 4/9/19.
 */
public class Solution {
    private int re = 0;
    private int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return re;
    }
    private void helper(TreeNode root){
        if (root == null){
            return;
        }
        if (count != 0 && root.left != null){
            helper(root.left);
        }
        count--;
        if (count == 0){
            re = root.val;
            return;
        }
        if (root.right != null){
            helper(root.right);
        }
    }
}
