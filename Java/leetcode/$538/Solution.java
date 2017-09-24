package com.sh.leetcoder.$538;

import com.sh.leetcoder.datastruc.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:02 2017/3/19.
 */
public class Solution {
    public LinkedList<TreeNode> linkedList = new LinkedList<>();

    public TreeNode convertBST(TreeNode root) {

        mid(root);
        TreeNode treeNode = linkedList.pollLast();
        while (!linkedList.isEmpty()) {
            linkedList.peekLast().val += treeNode.val;
            treeNode = linkedList.pollLast();
        }

//        TreeNode treeNode = convertBST(root.right);
//        if (treeNode != null)
//            root.val = root.val + treeNode.val;
//        TreeNode treeNode1 = convertBST(root.left);
//        if (treeNode1 != null)
//            treeNode1.val = treeNode1.val + root.val;
        return root;
    }

    public void mid(TreeNode root) {
        if (root == null)
            return;
        mid(root.left);
        linkedList.offer(root);
        mid(root.right);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        solution.convertBST(root);
    }
}
