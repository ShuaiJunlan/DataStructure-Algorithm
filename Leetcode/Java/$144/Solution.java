package $144;

import datastruc.TreeNode;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 5:02 PM 2018/09/12.
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        // recursive(root, list);
        iteraticely(root, list);
        return list;
    }
    public void recursive(TreeNode node, List<Integer> list){
        if (node != null){
            list.add(node.val);
            recursive(node.left, list);
            recursive(node.right, list);
        }
    }
    public void iteraticely(TreeNode node, List<Integer> list){
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        while (node != null){
            list.add(node.val);
            if (node.right != null){
                linkedList.addFirst(node.right);
            }
            node = node.left;
            if (node == null && !linkedList.isEmpty()){
                node = linkedList.pop();
            }
        }
    }
}
