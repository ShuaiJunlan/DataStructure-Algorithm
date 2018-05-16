package $036;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:00 2018/5/16.
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> row = new HashSet<>();
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (board[i][j] != '.' && !row.add(board[i][j])){
                    return false;
                }
            }
            row.clear();
        }

        HashSet<Character> column = new HashSet<>();
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (board[j][i] != '.' && !column.add(board[j][i])){
                    return false;
                }

            }
            column.clear();
        }
        HashSet<Character> set = new HashSet<>();
        for(int m = 0; m < 3; m ++){
            for(int n = 0; n < 3; n ++){
                for(int i = m * 3; i < m * 3 + 3; i ++){
                    for(int j = n * 3; j < n * 3 + 3; j ++){
                        if(board[i][j] != '.' && !set.add(board[i][j])){
                            return false;
                        }
                    }
                }
                set.clear();
            }
        }
        return true;
    }
}
