package com.sh.leetcoder.$103;

import com.sh.leetcoder.datastruc.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:21 2017/4/6.
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();         //store the result
        LinkedList<TreeNode> linkedList = new LinkedList<>();   //store treenode
        LinkedList<Integer> tempList = new LinkedList<>();      //temporary LinkedList to store every level node value
        int temp = 0;
        boolean left_right = true;
        if (root != null) {
            linkedList.add(root);
            temp = linkedList.size();
        }
        while (linkedList.size() != 0 && temp > 0) {
            if (left_right) {
                TreeNode node = linkedList.removeFirst();
                tempList.add(node.val);
                if (node.left != null)
                    linkedList.add(node.left);
                if (node.right != null)
                    linkedList.add(node.right);
                temp--;
            } else {
                TreeNode node = linkedList.removeLast();
                tempList.add(node.val);
                if (node.right != null)
                    linkedList.addFirst(node.right);
                if (node.left != null)
                    linkedList.addFirst(node.left);
                temp--;
            }
            if (temp == 0) {
                lists.add(tempList);
                tempList = new LinkedList<>();
                temp = linkedList.size();
                left_right = !left_right;
            }
        }
        return lists;
    }
}
