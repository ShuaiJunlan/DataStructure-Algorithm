package com.sh.leetcoder.$403;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:22 2017/3/28.
 */

/**
 * TLE
 */
public class Solution {
    public boolean re = false;
    public boolean canCross(int[] stones) {
        if (stones.length == 0 || stones == null)
            return false;
        re = false;
        bfs(stones, 0, 0);
        return re;
    }
    public void bfs(int[] stones, int i, int k) {
        if (i == stones.length - 1) {
            re = true;
            return;
        }
        if (i < stones.length - 1) {
            int temp = i + 1;
            while (temp <= stones.length - 1 && stones[temp] - stones[i] <= k + 1) {
                if (stones[temp] - stones[i] == k || stones[temp] - stones[i] == k + 1 || stones[temp] - stones[i] == k - 1)
                    bfs(stones, temp, stones[temp] - stones[i]);
                temp++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {0, 1, 3, 5, 6, 8, 12, 17};
        int[] a1 = {0, 1, 2, 3, 4, 8, 9, 11};
        int[] a2 = {0};
        int[] a3 = {0, 1};
        int[] a4 = {};
        System.out.println(solution.canCross(a));
        System.out.println(solution.canCross(a1));
        System.out.println(solution.canCross(a2));
        System.out.println(solution.canCross(a3));
        System.out.println(solution.canCross(a4));
    }
}
