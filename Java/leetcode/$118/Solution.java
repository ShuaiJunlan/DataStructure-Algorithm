package com.sh.leetcoder.$118;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:39 2017/4/17.
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> linkedList = new ArrayList<>();
        if (numRows == 1) {
            linkedList.add(1);
            lists.add(new LinkedList<>(linkedList));
            linkedList.clear();
        } else if (numRows == 2) {
            linkedList.add(1);
            lists.add(new ArrayList<>(linkedList));
            linkedList.add(1);
            lists.add(new ArrayList<>(linkedList));
            linkedList.clear();
        } else if (numRows >= 3) {
            linkedList.add(1);
            lists.add(new ArrayList<>(linkedList));
            linkedList.add(1);
            lists.add(new ArrayList<>(linkedList));
            linkedList.clear();

            for (int i = 3; i <= numRows; i++) {
                linkedList.add(1);
                for (int j = 1; j < i - 1; j++) {
                    linkedList.add(lists.get(i - 2).get(j - 1) + lists.get(i - 2).get(j));
                }
                linkedList.add(1);
                lists.add(new ArrayList<>(linkedList));
                linkedList.clear();
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generate(5);
    }
}
