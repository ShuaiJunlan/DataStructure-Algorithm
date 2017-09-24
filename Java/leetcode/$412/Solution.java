package com.sh.leetcoder.$412;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:21 2017/4/5.
 */
public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            switch (getV(i)) {
                case 4:
                    list.add(String.valueOf(i));
                    break;
                case 3:
                    list.add("Buzz");
                    break;
                case 2:
                    list.add("Fizz");
                    break;
                case 1:
                    list.add("FizzBuzz");
                    break;
            }
        }
        return list;
    }

    public int getV(int n) {
        if (n % 3 == 0 && n % 5 == 0)
            return 1;
        else if (n % 3 == 0)
            return 2;
        else if (n % 5 == 0)
            return 3;
        else
            return 4;
    }
}
