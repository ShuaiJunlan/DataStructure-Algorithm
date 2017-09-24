package com.sh.leetcoder.$099;

import com.sh.leetcoder.datastruc.TreeNode;

import java.util.LinkedList;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 17:58 2017/3/13.
 */
public class Solution {
    public void recoverTree(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        after(root, queue);
        if (queue.size() == 0 || queue.size() == 1)
            return;
        TreeNode left = queue.poll();
        while (!queue.isEmpty() && left.val < queue.element().val) {
            left = queue.poll();
        }
        if (queue.size() != 0) {
            TreeNode right = queue.removeLast();
            while (!queue.isEmpty() && right.val > queue.getLast().val) {
                right = queue.removeLast();
            }
            left.val ^= right.val;
            right.val ^= left.val;
            left.val ^= right.val;
            return;
        }
    }

    public void after(TreeNode root, LinkedList<TreeNode> queue) {
        if (root == null)
            return;
        after(root.left, queue);
        queue.offer(root);
        after(root.right, queue);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode right = new TreeNode(1);
        root.right = right;
        Solution solution = new Solution();
        solution.recoverTree(root);
    }
}
