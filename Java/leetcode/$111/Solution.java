package com.sh.leetcoder.$111;

import com.sh.leetcoder.datastruc.TreeNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 17:11 2017/4/14.
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int a = minDepth(root.left);
        int b = minDepth(root.right);
        if (root.left == null && root.right == null)
            return a < b ? a + 1 : b + 1;
        else if (root.left == null && root.right != null)
            return b + 1;
        else if (root.left != null && root.right == null)
            return a + 1;
        else
            return a < b ? a + 1 : b + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(4);
        System.out.println(solution.minDepth(root));
    }
}
