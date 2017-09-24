package com.sh.offer;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:46 2017/1/20.
 */
public class $06 {
    static class BinaryTreeNode {
        int value;
        BinaryTreeNode leftChild;
        BinaryTreeNode rightChild;
    }

    public static BinaryTreeNode construct(int[] preorder, int[] inorder, int length) {
        if (preorder == null || inorder == null || length <= 0)
            return null;
        return constructCore(0, length - 1, 0, length - 1);
    }

    private static BinaryTreeNode constructCore(int startPreorder, int endPreorder, int startInorder, int endInorder) {
//        int rootValue =
        return new BinaryTreeNode();
    }
}
