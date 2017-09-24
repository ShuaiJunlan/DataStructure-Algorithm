package com.sh.leetcoder.$557;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:48 2017/4/9.
 */
public class Solution {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        int j = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                swapStr(str, j, i - 1);
                j = i + 1;
            }
        }
        swapStr(str, j, str.length - 1);
        return String.valueOf(str);
    }

    public void swapStr(char[] c, int a, int b) {
        while (a < b) {
            char temp = c[a];
            c[a++] = c[b];
            c[b--] = temp;
        }
    }
}
