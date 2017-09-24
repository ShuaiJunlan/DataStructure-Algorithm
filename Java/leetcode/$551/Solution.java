package com.sh.leetcoder.$551;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:52 2017/4/16.
 */
public class Solution {
    public boolean checkRecord(String s) {
        if (s == null)
            return true;
        int num_A = 0;
        int num_continuous_L = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                num_A++;
            } else if (s.charAt(i) == 'L') {
                int temp = 0;
                for (int j = i; j < s.length(); j++) {
                    if (s.charAt(j) == 'L')
                        temp++;
                    else {
                        i = j - 1;
                        break;
                    }
                }
                num_continuous_L = temp > num_continuous_L ? temp : num_continuous_L;

            }
        }
        if (num_A <= 1 && num_continuous_L <= 2)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkRecord("PPALLP"));
        System.out.println(solution.checkRecord("PPALLL"));
    }
}
