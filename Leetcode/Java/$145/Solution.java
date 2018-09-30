package $145;

import datastruc.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 8:34 PM 2018/09/30.
 *
 * Preorder, Inorder, and Postorder Iteratively Summarization
 * @see <a href='https://leetcode.com/problems/binary-tree-postorder-traversal/discuss/45551/Preorder-Inorder-and-Postorder-Iteratively-Summarization'> </a>
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        recursive(list, root);
        return list;
    }
    private void recursive(List<Integer> result, TreeNode root){
        if (root != null){
            recursive(result, root.left);
            recursive(result, root.right);
            result.add(root.val);
        }
    }
}
