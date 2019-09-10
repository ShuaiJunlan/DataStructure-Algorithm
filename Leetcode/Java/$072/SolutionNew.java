package $072;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:19 AM 9/10/19.
 */
public class SolutionNew {
    public int minDistance(String word1, String word2) {

        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i <= m; i++){
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++){
            dp[0][j] = j;
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (word1.charAt(i) == word2.charAt(j)){
                    dp[i+1][j+1] = dp[i][j];
                }else {
                    dp[i+1][j+1] = 1 +  Math.min(Math.min(dp[i][j], dp[i+1][j]), dp[i][j+1]);
                }
            }
        }
        return dp[m][n];
    }
}
