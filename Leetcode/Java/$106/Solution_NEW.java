package $106;

import datastruc.TreeNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 1:23 PM 3/25/19.
 */
public class Solution_NEW {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null){
            return null;
        }
        return helper(0, inorder.length-1, 0, postorder.length-1, inorder, postorder);
    }
    private TreeNode helper(int inStart, int inEnd, int postStart, int postEnd, int[] inorder, int[] postorder){
        if (inStart > inEnd || postStart > postEnd){
            return null;
        }
        TreeNode treeNode = new TreeNode(postorder[postEnd]);
        int temp = 0;
        for (int i = inStart; i <= inEnd; i++){
            if (postorder[postEnd] == inorder[i]){
                temp = i;
                break;
            }
        }

        treeNode.left = helper(inStart, inStart + temp - 1, postStart, postStart + temp - inStart - 1, inorder, postorder);
        treeNode.right = helper(temp+1, inEnd, postStart + temp - inStart, postEnd - 1, inorder, postorder);
        return treeNode;
    }
}
