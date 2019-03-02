package $124;

import datastruc.TreeNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 5:20 PM 3/2/19.
 */
public class Solution {
    int maxValue = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        recursive(root);
        return maxValue;
    }
    private int recursive(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = Math.max(0, recursive(root.left));
        int right = Math.max(0, recursive(root.right));
        maxValue = Math.max(maxValue, left+right+root.val);
        // return left+right+root.val; // why not? one path.
        return Math.max(left, right)+root.val;
    }
}
