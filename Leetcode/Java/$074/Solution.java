package $074;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:27 AM 2018/07/25.
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0){
            return false;
        }
        if (matrix.length == 1){
            for (int m = 0; m < matrix[0].length; m++){
                if (matrix[0][m] == target){
                    return true;
                }
            }
            return false;
        }
        int i = 0, j = 1;
        while (j < matrix.length){
            if (target >= matrix[i][0] && target < matrix[j][0]){
                for (int m = 0; m < matrix[0].length; m++){
                    if (matrix[i][m] == target){
                        return true;
                    }
                }
            }
            i++;
            j++;
        }
        for (int m = 0; m < matrix[0].length; m++){
            if (matrix[j-1][m] == target){
                return true;
            }
        }
        return false;
    }

}
