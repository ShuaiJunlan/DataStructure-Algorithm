package $051;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 12:50 PM 2018/07/14.
 */
public class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        boolean[] flag = new boolean[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        List<List<String>> res = new ArrayList<>();
        dfs(board, 0, res, flag);
        return res;
    }

    private void dfs(char[][] board, int colIndex, List<List<String>> res, boolean[] flag) {
        if(colIndex == board.length) {
            res.add(construct(board));
            return;
        }

        for(int i = 0; i < board.length; i++) {
            if(!flag[i] && validate(board, i, colIndex)) {
                board[i][colIndex] = 'Q';
                flag[i] = true;
                dfs(board, colIndex + 1, res, flag);
                board[i][colIndex] = '.';
                flag[i] = false;
            }
        }
    }

    private boolean validate(char[][] board, int x, int y) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < y; j++) {
                // Considering the duplicate result,
                // cases including left-top to right-bottom diagonal(x+y == i+j)
                // or right-top to left-bottom diagonal(x+j == y+i)
                if(board[i][j] == 'Q' && (x + j == y + i || x + y == i + j || x == i)){
                    return false;
                }
            }
        }

        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> res = new LinkedList<>();
        for(int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

}
