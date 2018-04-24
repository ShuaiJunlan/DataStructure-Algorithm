package $807;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:24 2018/3/25.
 */
public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if (grid == null || grid.length == 0){
            return 0;
        }
        int[] bottomUp = new int[grid[0].length];
        int[] leftRight = new int[grid.length];
        for (int i = 0; i < leftRight.length; i++){
            int maxLeftRight = 0;
            for (int j = 0; j < bottomUp.length; j++){
                maxLeftRight = Math.max(maxLeftRight, grid[i][j]);
            }
            leftRight[i] = maxLeftRight;
        }

        for (int i = 0; i < bottomUp.length; i++){
            int maxBottomUp = 0;
            for (int j = 0; j < leftRight.length; j++){
                maxBottomUp = Math.max(maxBottomUp, grid[j][i]);
            }
            bottomUp[i] = maxBottomUp;
        }

        int sum = 0;
        for (int i = 0; i < leftRight.length; i++){
            for (int j = 0; j < bottomUp.length; j++){
                sum += (Math.min(leftRight[i], bottomUp[j]) - grid[i][j]);
            }
        }
        return sum;
    }
}
