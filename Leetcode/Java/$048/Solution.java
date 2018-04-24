package $048;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:31 2017/10/24.
 */

/**
 * Not the best answer, to can be optimized.
 */
class Solution {
    public void rotate(int[][] matrix) {
        if (matrix == null){
            return;
        }
        int n = matrix.length;
        int[][] re = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                re[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = n - 1; j >= 0; j--){
                matrix[i][n-j-1] = re[j][i];
            }
        }
    }

    public static void main(String[] args) {
       int[][] matrix =
               {
                       {1,2,3},
                       {4,5,6},
                       {7,8,9}
               };
       Solution solution = new Solution();
       solution.rotate(matrix);
    }
}
