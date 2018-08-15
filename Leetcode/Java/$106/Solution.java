package $106;

import datastruc.TreeNode;

import java.util.HashMap;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:20 AM 2018/08/15.
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder){
        if (inorder == null || postorder == null || inorder.length == 0 || postorder.length == 0){
            return null;
        }
        HashMap<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < inorder.length; i++){
            index.put(inorder[i], i);
        }
        return buildTreePostIn(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, index);
    }
    private TreeNode buildTreePostIn(int[] inorder, int is, int ie, int[] postorder, int ps, int pe, HashMap<Integer, Integer> hm){
        if (ps > pe || is > ie){
            return null;
        }
        TreeNode root = new TreeNode(postorder[pe]);
        int ri = hm.get(postorder[pe]);
        TreeNode leftChild = buildTreePostIn(inorder, is, ri - 1, postorder, ps, ps+ri-is-1, hm);
        TreeNode rightChild = buildTreePostIn(inorder, ri + 1, ie, postorder, ps+ri-is, pe-1, hm);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }
}
