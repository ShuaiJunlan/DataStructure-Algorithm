package $240;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 2:58 PM 10/23/19.
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int rows = 0, cloumns = matrix[0].length-1;
        while (rows < matrix.length && cloumns >= 0){
            if (target == matrix[rows][cloumns]){
                return true;
            } else if (target > matrix[rows][cloumns]){
                rows++;
            } else {
                cloumns--;
            }
        }
        return false;
    }
}
