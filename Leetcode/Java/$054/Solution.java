package $054;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 3:45 PM 2018/07/09.
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0){
            return new ArrayList<>();
        }
        int row = matrix.length;
        int columns = matrix[0].length;
        int circle = 0;
        List<Integer> list = new ArrayList<>(row * columns);
        while (2 * circle < columns && 2 * circle < row) {
            for (int i = circle; i < columns - circle; i++){
                list.add(matrix[circle][i]);
            }
            for (int j = circle + 1; j < row - circle - 1; j++){
                list.add(matrix[j][columns - circle - 1]);
            }
            for (int m = columns - circle - 1; m >= circle && circle != row - circle - 1; m--){
                list.add(matrix[row - circle - 1][m]);
            }
            for (int n = row - circle - 2; n > circle && circle != columns - circle - 1; n--){
                list.add(matrix[n][circle]);
            }
            circle++;
        }
        return list;
    }
}
