package $098;

import datastruc.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 3:07 PM 2018/07/17.
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null){
            return false;
        }
        LinkedList<TreeNode> nodes = new LinkedList<>();
        pre(root, nodes);
        TreeNode temp = nodes.poll();
        for (TreeNode node : nodes){
            if (node.val <= temp.val){
                return false;
            }
            temp = node;
        }
        return true;
    }
    public void pre(TreeNode root, List<TreeNode> list){
        if (root != null){
            pre(root.left, list);
            list.add(root);
            pre(root.right, list);
        }
    }
}
