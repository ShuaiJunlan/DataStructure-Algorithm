package $110;

import datastruc.TreeNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:56 2017/4/7.
 */
public class Solution {
    private static final int UNBALANCED = -1;

    //    public boolean isBalanced(TreeNode root)
//    {
//        if (root == null)
//            return true;
//        if (Math.abs(getDepth(root.left) - getDepth(root.right)) > 1)
//            return false;
//        return isBalanced(root.left) && isBalanced(root.right);
//    }
//    public int getDepth(TreeNode root)
//    {
//        if (root == null)
//            return 0;
//        return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
//    }
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        return getDepth(root) != UNBALANCED;
    }

    public int getDepth(TreeNode root) {
        if (root == null)
            return 0;
        int a = getDepth(root.left);
        int b = getDepth(root.right);
        if (a == UNBALANCED || b == UNBALANCED || Math.abs(a - b) > 1)
            return UNBALANCED;
        return Math.max(a, b) + 1;
    }
}
