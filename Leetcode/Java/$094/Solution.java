package $094;

import datastruc.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:42 2018/6/26.
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root != null){
            recursion(root, list);
        }
        return list;
    }
    public void recursion(TreeNode node, List<Integer> list){
        if (node != null){
            recursion(node.left, list);
            list.add(node.val);
            recursion(node.right, list);
        }
    }
}
