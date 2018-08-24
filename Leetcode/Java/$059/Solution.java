package $059;


/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:35 AM 2018/07/10.
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        if (n <= 0){
            return new int[0][];
        }
        int[][] matrix = new int[n][n];

        int circle = 0, count = 0;
        while (2 * circle < n) {
            for (int i = circle; i < n - circle; i++){
                matrix[circle][i] = ++count;
            }
            for (int j = circle + 1; j < n - circle - 1; j++){
                matrix[j][n - circle - 1] = ++count;
            }
            for (int m = n - circle - 1; m >= circle && circle != n - circle - 1; m--){
                matrix[n - circle - 1][m] = ++count;
            }
            for (int q = n - circle - 2; q > circle && circle != n - circle - 1; q--){
                matrix[q][circle] = ++count;
            }
            circle++;
        }
        return matrix;
    }
}
