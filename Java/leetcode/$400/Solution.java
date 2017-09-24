package com.sh.leetcoder.$400;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 8:54 2017/4/2.
 */
public class Solution {
    /**
     * @param n
     * @return
     */
    public int findNthDigit(int n) {
        int temp = 0;
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            if (temp + 9 * Math.pow(10, i - 1) * i >= n) {
                int t = (n - temp) / i;
                int k = (n - temp) % i;
//                System.out.println((Math.pow(10, i - 1) - 1) + t);
                if (k == 0)
                    return String.valueOf(((int) Math.pow(10, i - 1) - 1) + t).charAt(i - 1) - '0';
                else
                    return String.valueOf(((int) Math.pow(10, i - 1) - 1) + t + 1).charAt(k - 1) - '0';
            }
            temp += (9 * Math.pow(10, i - 1) * i);
        }
        return -1;
    }

    public int findNthDigit1(int n) {
        int len = 1;
        long count = 9;
        int start = 1;

        while (n > len * count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.findNthDigit(9));
//        System.out.println(solution.findNthDigit(10));
//        System.out.println(solution.findNthDigit(11));
//        System.out.println(solution.findNthDigit(1000000000));
//        System.out.println(solution.findNthDigit1(1000000000));
//        System.out.println(solution.findNthDigit(100));
//        System.out.println(solution.findNthDigit1(100));
//        System.out.println(solution.findNthDigit(10000));
//        System.out.println(solution.findNthDigit1(10000));
//
//        System.out.println(solution.findNthDigit(1000000000));
//        System.out.println(solution.findNthDigit1(1000000000));
        System.out.println(solution.findNthDigit(999999999));
        System.out.println(solution.findNthDigit1(999999999));
        System.out.println(Math.pow(10, 9));
    }
}
