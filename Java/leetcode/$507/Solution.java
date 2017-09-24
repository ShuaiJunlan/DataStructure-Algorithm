package com.sh.leetcoder.$507;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:32 2017/3/26.
 */
public class Solution {
    public static boolean checkPerfectNumber(int num) {
        if (num == 1)
            return false;
        int sum = 1;
        int temp = (int) Math.sqrt(num);
        for (int i = 2; i <= temp; i++) {
            if (num % i == 0)
                sum += (i + num / i);
        }
        if (sum == num)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Solution.checkPerfectNumber(28));
    }
}
