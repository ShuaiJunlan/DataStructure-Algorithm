package com.sh.leetcoder.$401;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:04 2017/3/29.
 */
public class Solution {
    public static int[] arr = new int[10];
    public static List<String> list = new LinkedList<>();
    public static int n = 0;
    public static int count = 0;

    /**
     * 逆向思维
     *
     * @param num
     * @return
     */
    public List<String> readBinaryWatch(int num) {
//        List<String> list = new LinkedList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount((i << 6) + j) == num) {
                    System.out.println(i);
                    list.add(String.format("%d:%02d", i, j));
                }
            }
        }
        return list;
    }

    /**
     * 递归实现求排列组合，再判断是否符合条件。
     *
     * @param step
     */
    public void dfs(int step) {
        if (step == n) {
            count++;
            int hours = 0, minutes = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1 && i <= 3)
                    hours += (1 << (3 - i));
                else if (arr[i] == 1 && i >= 4) {
                    minutes += (1 << (9 - i));
                }
            }
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                arr[i] = 1;
                dfs(step + 1);
                arr[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.readBinaryWatch(0);
        System.out.println(list.toString());
        int i = 2;
        int j = i << 2 + 1;
        System.out.println(i + " " + j);

    }
}
