package $105;

import datastruc.TreeNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:02 PM 3/18/19.
 */
public class Solution_NEW {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, preorder.length-1,0, preorder.length-1, preorder, inorder);

    }
    private TreeNode helper(int preStart, int preEnd, int inStart, int inEnd, int[] preOrder, int[] inOrder){
        if (inStart > inEnd || preStart > preEnd){
            return null;
        }
        TreeNode root = new TreeNode(preOrder[preStart]);
        int temp = 0;
        for (int i = inStart; i <= inEnd; i++){
            if (preOrder[preStart] == inOrder[i]){
                temp = i;
                break;
            }
        }
        root.left = helper(preStart+1, preStart+temp, inStart, temp-1, preOrder, inOrder);
        root.right = helper(preStart+temp+1-inStart, preEnd, temp+1, inEnd, preOrder, inOrder);
        return root;
    }
}
