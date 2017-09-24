package com.sh.leetcoder.$415;

import java.math.BigInteger;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:27 2017/3/20.
 */
public class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger bigInteger1 = new BigInteger(num1);
        BigInteger bigInteger2 = new BigInteger(num2);
        return String.valueOf(bigInteger1.add(bigInteger2));
//        char[] chars1 = num1.toCharArray();
//        char[] chars2 = num2.toCharArray();
//        int t1 = chars1.length;
//        int t2 = chars2.length;
//        while (t1 > 0 && t2 > 0)
//        {
//            t1--;
//            t2--;
//
//        }
//        int temp = t1 < t2 ? t1 : t2;
//        while (temp > 0)
//        {
//            temp--;
//
//        }
//        return String.valueOf(Integer.valueOf(num1)+Integer.valueOf(num2));
    }

}
