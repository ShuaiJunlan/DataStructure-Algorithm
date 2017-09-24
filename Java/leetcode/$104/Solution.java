package com.sh.leetcoder.$104;

import com.sh.leetcoder.datastruc.TreeNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 8:51 2017/4/6.
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
//        return maxDepth(root.left) > maxDepth(root.right) ? maxDepth(root.left) + 1 : maxDepth(root.right) + 1;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
