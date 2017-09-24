package com.sh.offer.$28;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 17:44 2017/2/27.
 */

import java.util.ArrayList;

/**
 * 实现全排列
 */
public class $28 {
    //    public static void permutation(char[] str, int start)
//    {
//        if (str == null || str.length <= 0 || start <0)
//            return;
//        if (start == str.length-1)
//            printChar(str);
//        for (int i = start; i < str.length; i++)
//        {
//            char tempChar = str[start];
//            str[start] = str[i];
//            str[i] = tempChar;
//
//            permutation(str, start + 1);
//
//            tempChar = str[start];
//            str[start] = str[i];
//            str[i] = tempChar;
//        }
//    }
//    public static void printChar(char[] str)
//    {
//        for (int i = 0; i < str.length; i++)
//        {
//            System.out.print(str[i] + " ");
//        }
//        System.out.println();
//    }
    public ArrayList<String> Permutation(String str) {
        if (str == null || str == "")
            return null;
        ArrayList<String> result = new ArrayList<String>();
        java.util.Set<String> re = new java.util.HashSet<String>();
        permutation(str.toCharArray(), 0, re);
        result.addAll(re);
        java.util.Collections.sort(result);
        return result;
    }

    public void permutation(char[] str, int start, java.util.Set<String> re) {
        if (start == str.length - 1)
            re.add(String.valueOf(str));
        for (int i = start; i < str.length; i++) {
            char tempChar = str[start];
            str[start] = str[i];
            str[i] = tempChar;

            permutation(str, start + 1, re);

            tempChar = str[start];
            str[start] = str[i];
            str[i] = tempChar;
        }
    }

    public static void main(String[] args) {
        char[] a = {'s', 'v', 'h'};
        $28 o = new $28();
        ArrayList<String> re = o.Permutation("abc");
        for (int i = 0; i < re.size(); i++) {
            System.out.println(re.get(i));
        }
        System.out.println(a.toString());
//        permutation(a, 0);
//        System.out.println(a.length);
    }

}
