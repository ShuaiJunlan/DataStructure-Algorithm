package $543;

import datastruc.TreeNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:35 2017/3/19.
 */
public class Solution {
    public int[] re = new int[3];
    public int k = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        k = Math.max(getDepth(root.left) + getDepth(root.right), k);
        k = Math.max(diameterOfBinaryTree(root.left), k);
        k = Math.max(diameterOfBinaryTree(root.right), k);
        return k;
    }

    public int getDepth(TreeNode node) {
        if (node == null)
            return 0;
        int left = getDepth(node.left);
        int right = getDepth(node.right);
        return left > right ? left + 1 : right + 1;
    }

    public int getMax(int[] a) {
        int k = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[1] > k)
                k = a[1];
        }
        return k;
    }
}
