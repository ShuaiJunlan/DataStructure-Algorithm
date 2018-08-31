package $114;

import datastruc.TreeNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 18:08 2018/8/31.
 */
public class Solution {
    private TreeNode prev = null;
    public void flatten(TreeNode root){
        if (root == null){
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
