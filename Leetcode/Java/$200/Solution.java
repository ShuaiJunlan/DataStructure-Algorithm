package $200;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:50 PM 2/25/19.
 */
public class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0){
            return 0;
        }
        int m = grid.length, n = grid[0].length, count = 0;

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (grid[i][j] == '1'){
                    dfs(grid, i, j, m, n);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int i, int j, int m, int n){
        if (i < 0 || i>=m || j < 0 || j >= n || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i+1, j, m, n);
        dfs(grid, i-1, j, m, n);
        dfs(grid, i, j+1, m, n);
        dfs(grid, i, j-1, m, n);
    }
}
