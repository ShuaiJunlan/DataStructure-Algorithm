package $101;

import datastruc.TreeNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 2:36 PM 8/30/19.
 */
public class SolutionNew {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return isSym(root.left, root.right);

    }
    private boolean isSym(TreeNode left, TreeNode right){
        if (left == null && right == null){
            return true;
        }
        if (left != null && right != null && left.val == right.val){
            return isSym(left.left, right.right) && isSym(left.right, right.left);
        }
        return false;
    }
}
