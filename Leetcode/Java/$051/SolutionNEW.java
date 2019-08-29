package $051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:04 AM 8/29/19.
 */
public class SolutionNEW {
    public List<List<String>> solveNQueens(int n) {
        if (n <= 0){
            return Collections.emptyList();
        }
        char[][] queens = new char[n][n];
        boolean[] flag = new boolean[n];
        for (int i = 0; i < n; i++){
            queens[i] = new char[n];
            Arrays.fill(queens[i], '.');
        }
        List<List<String>> re = new ArrayList<>();
        dfs(re, 0, queens, flag);
        return re;

    }
    private void dfs(List<List<String>> lists, int colIndex, char[][] queens, boolean[] flag){
        if (colIndex == queens.length){
            lists.add(construct(queens));
            return;
        }
        for (int i = 0; i < queens.length; i++){
            if (!flag[i] && validate(queens, i, colIndex)){
                queens[i][colIndex] = 'Q';
                flag[i] = true;
                dfs(lists, colIndex+1, queens, flag);
                queens[i][colIndex] = '.';
                flag[i] = false;
            }
        }
    }
    private boolean validate(char[][] queens, int i, int j){
        for (int m = 0; m < queens.length; m++){
            for (int n = 0; n < j; n++){
                if (queens[m][n] == 'Q' && (m == i || i + n == j + m || i + j == m + n)){
                    return false;
                }
            }
        }
        return true;
    }

    private List<String> construct(char[][] queens){
        List<String> list = new ArrayList<>();
        for (char[] queen : queens) {
            list.add(new String(queen));
        }
        return list;
    }
}
