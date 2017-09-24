package com.sh.leetcoder.$119;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:55 2017/4/18.
 */
public class Solution {
    /**
     * 这种方法将会导致数字超出int所能表示的范围。
     *
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i <= rowIndex; i++) {
            list.add(getValueByC(rowIndex, i));
        }
        return list;
    }

    public int getValueByC(int a, int b) {
        if (b > (a >> 1))
            b = a - b;
        int T = 1;
        int temp = b;
        while (0 != temp--)
            T *= a--;
        int B = 1;
        while (0 != b)
            B *= b--;
        return T / B;
    }

    public List<Integer> getRow1(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        if (rowIndex < 0)
            return list;

        for (int i = 0; i < rowIndex + 1; i++) {
            list.add(0, 1);
            for (int j = 1; j < list.size() - 1; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getRow(0));
        System.out.println(solution.getRow(1));
        System.out.println(solution.getRow(2));
        System.out.println(solution.getRow1(34));
        System.out.println(solution.getRow(34));
    }
}
