package com.sh.leetcoder.$386;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:37 2017/3/19.
 */
public class Solution {
    public List<Integer> lexicalOrder(int n) {
        int curr = 1;
        List<Integer> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            list.add(curr);
            if (curr * 10 <= n)
                curr *= 10;
            else if (curr % 10 != 9 && curr + 1 <= n)
                curr++;
            else {
                while ((curr / 10) % 10 == 9)
                    curr /= 10;
                curr /= 10;
                curr++;
            }
        }
        return list;
    }
}
