package $063;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 1:23 PM 2018/08/12.
 */
public class Solution_TLE {
    private int count;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0){
            return 0;
        }
        count = 0;
        helpDFS(obstacleGrid, 0, 0);
        return count;
    }
    private void helpDFS(int[][] grid, int i, int j){
        if (grid[i][j] == 1){
            return;
        }
        if (i == grid.length - 1 && j == grid[0].length - 1){
            count++;
        }
        //right
        if (j + 1 < grid[0].length){
            helpDFS(grid, i, j + 1);
        }
        //down
        if (i + 1 < grid.length){
            helpDFS(grid, i + 1, j);
        }

    }
}
