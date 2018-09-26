package $129;


import datastruc.TreeNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 8:53 PM 2018/09/25.
 */
public class Solution {
    private int sum = 0;
    public int sumNumbers(TreeNode root){
        if (root == null){
            return 0;
        }
        sum = 0;
        dfs(root, root.val);
        return sum;
    }
    private void dfs(TreeNode root, int val){
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            sum += val;
        } else if (root.left != null && root.right != null){
            dfs(root.left, val * 10 + root.left.val);
            dfs(root.right, val * 10 + root.right.val);
        }else if (root.left != null){
            dfs(root.left, val * 10 + root.left.val);

        }else{
            dfs(root.right, val * 10 + root.right.val);
        }
    }
}
