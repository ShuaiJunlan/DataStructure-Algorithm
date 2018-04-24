package $102;

import datastruc.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:21 2017/4/6.
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        LinkedList<Integer> tempList = new LinkedList<>();
        int temp = 0;
        if (root != null) {
            linkedList.add(root);
            temp = linkedList.size();
        }
        while (linkedList.size() != 0 && temp > 0) {
            TreeNode node = linkedList.removeFirst();
            tempList.add(node.val);
            if (node.left != null)
                linkedList.add(node.left);
            if (node.right != null)
                linkedList.add(node.right);
            temp--;
            if (temp == 0) {
                lists.add(tempList);
                tempList = new LinkedList<>();
                temp = linkedList.size();
            }
        }
        return lists;
    }
}
