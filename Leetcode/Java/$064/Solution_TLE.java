package $064;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:54 AM 2018/07/03.
 */
public class Solution_TLE {
    public static int minSum;
    public int minPathSum(int[][] grid) {
        minSum = Integer.MAX_VALUE;
        if (grid == null || grid.length == 0){
            return 0;
        }
        bfs(grid, grid[0][0], 0, 0);
        return minSum;
    }
    public void bfs(int[][] grid, int sum, int i, int j){
        if (sum >= minSum){
            return;
        }else if (i == grid.length - 1 && j == grid[0].length - 1){
            minSum = sum;
            return;
        }
        //down
        if (i+1 < grid.length){
            bfs(grid, sum + grid[i+1][j], i + 1, j);
        }
        //right
        if (j+1 < grid[0].length){
            bfs(grid, sum + grid[i][j+1], i, j + 1);
        }
    }

}
