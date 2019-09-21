package $437;

import datastruc.TreeNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:20 PM 9/20/19.
 */
public class SolutionWrong {
    private int count = 0;
    public int pathSum(TreeNode root, int sum) {
        if (root == null){
            return count;
        }
        help(root, 0, sum);
        return count;
    }
    private void help(TreeNode root, int current, int sum){
        if (current == sum){
            count++;
            return;
        }
        if (current > sum){
            return;
        }
        if (root == null){
            return;
        }
        help(root.left, current + root.val, sum);
        help(root.left, 0, sum);
        help(root.right, current + root.val, sum);
        help(root.right, 0, sum);
    }
}
