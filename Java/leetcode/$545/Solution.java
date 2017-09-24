package com.sh.leetcoder.$545;

import com.sh.leetcoder.datastruc.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:47 2017/3/26.
 * <p>
 * 有bug，待解决。
 */
public class Solution {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if (root == null) {
            LinkedList<Integer> list = new LinkedList<>();
            return list;
        } else if (root.left == null && root.right == null) {
            LinkedList<Integer> list = new LinkedList<>();
            list.add(root.val);
            return list;
        }
        LinkedList<Integer> linkedList1 = new LinkedList<>();       //  二叉树左边界
        LinkedList<Integer> linkedList2 = new LinkedList<>();       //  二叉树右边界
        LinkedList<Integer> linkedList3 = new LinkedList<>();       //  二叉树叶子节点

        getLeftBoundary(root.left, linkedList1);
        getRightBoundary(root.right, linkedList2);
        getLeafNode(root, linkedList3);

        LinkedList<Integer> re = new LinkedList<>();
        re.add(root.val);

        if (linkedList1.size() > 0)
            linkedList1.removeLast();
        re.addAll(linkedList1);

        re.addAll(linkedList3);
        if (linkedList2.size() > 0)
            linkedList2.removeLast();
        while (linkedList2.size() != 0) {
            re.add(linkedList2.pollLast());
        }
        return re;

    }

    /**
     * 获取二叉树的左边界值，不包括root节点
     *
     * @param root
     * @param linkedList
     */
    public void getLeftBoundary(TreeNode root, LinkedList<Integer> linkedList) {
        if (root != null) {
            linkedList.add(root.val);
            if (root.left != null) {
                getLeftBoundary(root.left, linkedList);
            } else if (root.right != null) {
                getLeftBoundary(root.right, linkedList);
            }
        }

    }

    /**
     * 获取二叉树的右边界值，不包括root节点
     *
     * @param root
     * @param linkedList
     */
    public void getRightBoundary(TreeNode root, LinkedList<Integer> linkedList) {
        if (root != null) {
            linkedList.add(root.val);
            if (root.right != null) {
                getLeftBoundary(root.right, linkedList);
            } else if (root.left != null) {
                getLeftBoundary(root.left, linkedList);
            }
        }
    }

    /**
     * 获取二叉树所有的叶子节点
     *
     * @param root
     * @param linkedList
     */
    public void getLeafNode(TreeNode root, LinkedList<Integer> linkedList) {
        if (root.left == null && root.right == null)
            linkedList.add(root.val);
        if (root.left != null)
            getLeafNode(root.left, linkedList);
        if (root.right != null)
            getLeafNode(root.right, linkedList);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(2);
//        root.right.left = new TreeNode(3);
//        root.right.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(3);
        root.right.right.right.right = new TreeNode(4);
        root.right.right.right.right.right = new TreeNode(5);
        Solution solution = new Solution();
        solution.boundaryOfBinaryTree(root);
    }
}
