package $113;

import datastruc.TreeNode;

import java.util.*;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:19 2017/4/17.
 */
public class Solution {
    public List<List<Integer>> lists = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        helper(root, sum, new LinkedList<>());
        return lists;
    }

    public void helper(TreeNode node, int sum, LinkedList<Integer> linkedList) {
        if (node == null)
            return;
        linkedList.add(node.val);
        if (node.left == null && node.right == null && sum - node.val == 0) {
            lists.add(new LinkedList<>(linkedList));
            linkedList.remove(linkedList.size() - 1);
            return;
        }
        helper(node.left, sum - node.val, linkedList);
        helper(node.right, sum - node.val, linkedList);
        linkedList.remove(linkedList.size() - 1);
    }
}
