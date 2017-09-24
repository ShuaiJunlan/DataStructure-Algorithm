package com.sh.leetcoder.$405;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 11:09 2017/3/28.
 */
public class Solution {
    public String toHex(int num) {
        if (num == 0)
            return "0";
        StringBuilder stringBuilder = new StringBuilder();
        while (num != 0) {
            int temp = num & 0xf;
            stringBuilder.append(temp < 10 ? (char) (temp + '0') : (char) (temp - 10 + 'a'));
            num >>>= 4;
        }
        return stringBuilder.reverse().toString();
    }

    /**
     * 将十进制转换成十六进制，无法处理负数的问题，有待解决。
     *
     * @param n
     * @param s
     */
    public static void getHexValue(int n, StringBuilder s) {
        if (n / 16 > 15) {
            getHexValue(n / 16, s);
            getHexValue(n % 16, s);
        } else if (n / 16 > 0) {
            s.append(getV(n / 16));
            getHexValue(n % 16, s);
        } else if (n / 16 == 0) {
            s.append(getV(n));
        }
    }

    public static String getV(int a) {
        switch (a) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "a";
            case 11:
                return "b";
            case 12:
                return "c";
            case 13:
                return "d";
            case 14:
                return "e";
            default:
                return "f";
        }
    }


    public static void main(String[] args) {
        int n = 19;
        StringBuilder stringBuilder = new StringBuilder("");
        getHexValue(-1, stringBuilder);
        System.out.println(stringBuilder.toString());
        Solution solution = new Solution();
        System.out.println(solution.toHex(-1));

    }
}
