package com.sh.offer.$24;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:35 2017/2/27.
 */

/**
 * 判断一个数组是否可能为某二叉树的后序遍历
 */
public class $24 {
    public boolean verifySquenceOfBST(int[] sequence, int length) {
        if (sequence == null || length <= 0)
            return false;
        return verify(sequence, 0, length - 1);
    }

    private boolean verify(int[] sequence, int start, int end) {
        int i = 0;
        if (start < end) {
            for (; start < end; start++) {
                if (sequence[start] > sequence[end]) {
                    i = start;
                    break;
                }
            }
            for (; start < end; start++) {
                if (sequence[start] < sequence[end]) {
                    return false;
                }
                if (start == end - 1) {
                    return true;
                }
            }
//            return true;
        } else {
            return true;
        }

        return verify(sequence, start, i - 1) && verify(sequence, i, end - 1);
    }

    public static void main(String[] args) {
        int[] array1 = {5, 7, 6, 9, 11, 10, 8};
        int[] array2 = {7, 4, 6, 5};
        $24 o = new $24();
        System.out.println(o.verifySquenceOfBST(array1, array1.length));
        System.out.println(o.verifySquenceOfBST(array2, array2.length));
    }
}
