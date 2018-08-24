package $064;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 11:12 AM 2018/07/03.
 */
public class Solution {
    public int minPathSum(int[][] grid) {
        // row
        int m = grid.length;
        // column
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0) {
                    grid[i][j] = grid[i][j] + grid[i][j - 1];
                } else if (i != 0 && j == 0) {
                    grid[i][j] = grid[i][j] + grid[i - 1][j];
                } else if (i == 0 && j == 0) {
                    grid[i][j] = grid[i][j];
                } else {
                    grid[i][j] = Math.min(grid[i][j - 1], grid[i - 1][j]) + grid[i][j];
                }
            }
        }

        return grid[m - 1][n - 1];
    }
}
