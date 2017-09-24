package com.sh.offer.$32;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:48 2017/3/2.
 */
public class $32 {
    /**
     * 方法一：
     * 神奇的解法，还没看懂
     *
     * @param n
     * @return
     */
    public static int NumberOf1Between1AndN_Solution(int n) {
        int ones = 0;
        for (long m = 1; m <= n; m *= 10) {
            ones += (n / m + 8) / 10 * m + (n / m % 10 == 1 ? 1 : 0) * (n % m + 1);
        }
        return ones;

    }

    /**
     * 方法二：
     * 计算从1到n中1出现的次数。
     *
     * @param n
     * @return
     */
    public static int totalNumOf1(int n) {
        if (n <= 0)
            return 0;
        else if (n < 10)
            return 1;
        char[] num = String.valueOf(n).toCharArray();

        int length = num.length;
        char[] temp = new char[length - 1];
        System.arraycopy(num, 1, temp, 0, length - 1);
        int first = num[0] - '0';
        int numFirstDigit = 0;
        if (first > 1)
            numFirstDigit = powerOf10(length - 1);
        else if (first == 1) {
            numFirstDigit = Integer.valueOf(new String(temp)) + 1;
        }
        int numOtherDigits = first * (length - 1) * powerOf10(length - 2);
        int numRecursive = totalNumOf1(Integer.valueOf(new String(temp)));
        return numFirstDigit + numOtherDigits + numRecursive;
    }

    /**
     * 扩展：
     * 计算从1到n中m出现的次数
     *
     * @param n
     * @param m
     * @return
     */
    public static int totalNumOfM(int n, int m) {
        if (n <= 0)
            return 0;
        char[] num = String.valueOf(n).toCharArray();

        int length = num.length;
        char[] temp = new char[length - 1];
        System.arraycopy(num, 1, temp, 0, length - 1);
        int first = num[0] - '0';
        int numFirstDigit = 0;
        if (first > m)
            numFirstDigit = powerOf10(length - 1);
        else if (first == m) {
            if (temp.length != 0)
                numFirstDigit = Integer.valueOf(new String(temp)) + 1;
            else
                numFirstDigit += 1;
        }
        int numOtherDigits = first * (length - 1) * powerOf10(length - 2);
        int numRecursive = 0;
        if (temp.length != 0) {
            numRecursive = totalNumOfM(Integer.valueOf(new String(temp)), m);

        }
        return numFirstDigit + numOtherDigits + numRecursive;
    }

    public static int powerOf10(int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= 10;
        }
        return result;
    }

    public static int totalNumberOf0(int n, int m) {
        if (n / 10 == 0)
            return 0;
        if (n / 10 != 0 && n / 100 == 0)
            return n / 10;
        int count1 = totalNumberOf0(n / 10, m);
        int count = totalNumberOf0(n / 10, m);
        return count * 10 + count + count1;
    }


    public static void main(String[] args) {
//        System.out.println(totalNumOf1(999));
//        System.out.println(NumberOf1Between1AndN_Solution(999));
        System.out.print((totalNumOfM(7, 0) - 1) + " ");
        for (int i = 1; i < 10; i++) {
            System.out.print(totalNumOfM(7, i));
            if (i != 9) {
                System.out.print(" ");
            }
        }

        System.out.println(totalNumberOf0(3010, 0));
//        System.out.println(totalNumOfM(999, 7));
    }
}
