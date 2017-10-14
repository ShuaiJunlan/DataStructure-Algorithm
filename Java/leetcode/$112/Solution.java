package $112;


import datastruc.TreeNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:32 2017/4/12.
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null && sum - root.val == 0)
            return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public boolean getR(TreeNode root, int sum) {
        if (root == null && sum == 0)
            return true;
        else if (root == null && sum != 0)
            return false;
        else
            return getR(root.left, sum - root.val) || getR(root.right, sum - root.val);
    }
}
