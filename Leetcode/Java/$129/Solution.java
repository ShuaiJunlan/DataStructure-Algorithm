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
        recurse(root, root.val);
        return sum;
    }
    private void recurse(TreeNode root, int val){
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            sum += val;
        } else if (root.left != null && root.right != null){
            recurse(root.left, val * 10 + root.left.val);
            recurse(root.right, val * 10 + root.right.val);
        }else if (root.left != null){
            recurse(root.left, val * 10 + root.left.val);

        }else{
            recurse(root.right, val * 10 + root.right.val);
        }
    }
}
