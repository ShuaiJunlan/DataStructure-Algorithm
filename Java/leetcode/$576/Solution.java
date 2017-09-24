package com.sh.leetcoder.$576;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:50 2017/5/15.
 */
public class Solution {
    public static final int MOD = 1000000009;
    public int count = 0;
    //                              up      down    left    right
    public int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    public int findPaths(int m, int n, int N, int i, int j) {
        count = 0;
        bfs(m, n, N, i, j);
        return count;
    }
    public void bfs(int m, int n, int N, int i ,int j){
        if (N == 0) return ;
        for (int k = 0; k < 4; k++){
            int tempI = i;
            int tempJ = j;
            tempI += directions[k][1];
            tempJ += directions[k][0];
            if (tempI >= m || tempI < 0) count++;
            if (tempJ >= n || tempJ < 0) count++;
            count %= MOD;
            if (tempI < m && tempI >= 0 && tempJ < n && tempJ >= 0)
                bfs(m, n, N-1, tempI, tempJ);
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findPaths(2, 2, 2, 0, 0));
        System.out.println(solution.findPaths(1, 3, 3, 0, 1));
        System.out.println(solution.findPaths(1, 1, 1, 0, 0));
        System.out.println(solution.findPaths(8, 7, 16, 1, 5));
    }
}
