package com.sh.leetcoder.$101;

import com.sh.leetcoder.datastruc.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:40 2017/4/5.
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isSym(root.left, root.right);
    }

    /**
     * 通过递归的方式判断是否是对称的二叉树
     *
     * @param left
     * @param right
     * @return
     */
    public boolean isSym(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left != null && right == null || right != null && left == null) {
            return false;
        } else if (left.val == right.val) {
            return isSym(left.left, right.right) && isSym(left.right, right.left);
        }
        return false;
    }

    public boolean isSym1(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return true;
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        TreeNode a = root.left;
        TreeNode b = root.right;
        if (a != null)
            linkedList.add(a);
        if (b != null)
            linkedList.add(b);
        while (linkedList.size() != 0) {
            if ((linkedList.size() & 1) == 1)
                return false;
            TreeNode tempNode1 = linkedList.removeFirst();
            TreeNode tempNode2 = linkedList.removeFirst();
            if (tempNode1.val != tempNode2.val)
                return false;
            if (tempNode1.left != null && tempNode2.right != null) {
                linkedList.add(tempNode1.left);
                linkedList.add(tempNode2.right);
            } else if (tempNode1.left == null && tempNode2.right != null || tempNode1.left != null && tempNode2.right == null)
                return false;
            if (tempNode1.right != null && tempNode2.left != null) {
                linkedList.add(tempNode1.right);
                linkedList.add(tempNode2.left);
            } else if (tempNode1.right == null && tempNode2.left != null || tempNode1.right != null && tempNode2.left == null)
                return false;
        }
        return true;
    }
}
