package $064;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 11:44 AM 2018/07/03.
 */
public class Solution_DFS {

    public int minPathSum(int[][] grid) {
        /**recursion memorization**/
        int m = grid.length;
        int n = grid[0].length;
        int[][]memo = new int[m][n];
        int x=m;
        int y=n;
        return dfs(grid,x-1,y-1,memo);
    }

    public int dfs(int[][]grid,int x,int y,int[][]memo) {
        if(x<0 || y<0){
            return Integer.MAX_VALUE;
        }
        if(memo[x][y] > 0) {
            return memo[x][y];
        }

        if(x==0 && y==0) {
            return grid[0][0];
        }


        int ans = grid[x][y] + Math.min(dfs(grid,x-1,y,memo),dfs(grid,x,y-1,memo));
        memo[x][y]=ans;

        return ans;
    }
}
