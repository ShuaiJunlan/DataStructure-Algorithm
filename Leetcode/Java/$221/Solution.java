package $221;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:50 PM 4/7/19.
 */
public class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0){
            return 0;
        }
        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        int re = 0;
        for (int i = 1; i <= matrix.length; i++){
            for (int j = 1; j < matrix[0].length; j++){
                if (matrix[i-1][j-1] == '1'){
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
                    re = Math.max(re, dp[i][j]);
                }
            }
        }
        return re * re;
    }
}
