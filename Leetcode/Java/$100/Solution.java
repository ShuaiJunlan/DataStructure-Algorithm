package $100;


import datastruc.TreeNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 17:47 2017/3/13.
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p != null && q != null && p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        else
            return false;
    }
}
