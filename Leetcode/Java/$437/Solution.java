package $437;

import datastruc.TreeNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:06 PM 9/20/19.
 */
public class Solution {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int pathSumFrom(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        return (node.val == sum ? 1 : 0) + pathSumFrom(node.left, sum - node.val) + pathSumFrom(node.right, sum - node.val);
    }
}
