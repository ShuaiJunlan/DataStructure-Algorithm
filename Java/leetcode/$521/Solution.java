package com.sh.leetcoder.$521;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:37 2017/4/2.
 */
public class Solution {
    public int findLUSlength(String a, String b) {
        if (a == null && b == null)
            return -1;
        if (a == null)
            return b.length();
        if (b == null)
            return a.length();
        if (a.equals(b))
            return -1;
        return Math.max(a.length(), b.length());
    }
}
