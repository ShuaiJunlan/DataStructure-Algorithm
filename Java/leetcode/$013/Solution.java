package com.sh.leetcoder.$013;

import java.util.HashMap;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:56 2017/3/15.
 */
public class Solution {

    public int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        char[] str = s.toCharArray();
        int sum = 0, length = str.length - 1;
        for (int i = 0; i < length; i++) {
            if (hashMap.get(str[i + 1]) <= hashMap.get(str[i]))
                sum += hashMap.get(str[i]);
            else
                sum -= hashMap.get(str[i]);
        }
        sum += hashMap.get(str[length]);
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("DCXXI"));
    }
}
