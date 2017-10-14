package $105;

import datastruc.TreeNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:48 2017/4/15.
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, preorder.length - 1, preorder, inorder);
    }

    public TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > preorder.length - 1 || inStart > inEnd)
            return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (root.val == inorder[i]) {
                index = i;
                break;
            }
        }
        root.left = helper(preStart + 1, inStart, index - 1, preorder, inorder);
        root.right = helper(preStart + index - inStart + 1, index + 1, inEnd, preorder, inorder);
        return root;
    }
}
