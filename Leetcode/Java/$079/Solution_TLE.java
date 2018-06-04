package $079;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:06 2018/6/4.
 *
 * Time Limit Exceeded!
 */
public class Solution_TLE {
    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0){
            return true;
        }
        boolean result = false;
        boolean[][] mark = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (board[i][j] == word.charAt(0)){
                    mark[i][j] = true;
                    result = bfs(board, word, 1, i, j, mark);
                    mark[i][j] = false;
                    if (result){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean bfs(char[][] board, String word, int index, int i, int j, boolean[][] mark){
        if (index == word.length()){
            return true;
        }
        boolean re = false;
        // up
        if (i-1 >= 0 && i-1 < board.length && !mark[i-1][j]){
            if (board[i-1][j] == word.charAt(index)){
                mark[i-1][j] = true;
                re = re | bfs(board, word, index+1, i-1, j, mark);
                mark[i-1][j] = false;
            }
        }

        // down
        if (i+1 >= 0 && i+1 < board.length && !mark[i+1][j]){
            if (board[i+1][j] == word.charAt(index)){
                mark[i+1][j] = true;
                re = re | bfs(board, word, index+1, i+1, j, mark);
                mark[i+1][j] = false;
            }
        }

        // left
        if (j-1 >= 0 && j-1 < board[0].length && !mark[i][j-1]){
            if (board[i][j-1] == word.charAt(index)){
                mark[i][j-1] = true;
                re = re | bfs(board, word, index+1, i, j-1, mark);
                mark[i][j-1] = false;
            }
        }

        // right
        if (j+1 >= 0 && j+1 < board[0].length && !mark[i][j+1]){
            if (board[i][j+1] == word.charAt(index)){
                mark[i][j+1] = true;
                re = re | bfs(board, word, index+1, i, j+1, mark);
                mark[i][j+1] = false;
            }
        }
        return re;
    }

    public static void main(String[] args) {
        char[][] boards = {
          {'A','B','C','E'},
          {'S','F','C','S'},
          {'A','D','E','E'}
        };
        Solution_TLE solutionTLE = new Solution_TLE();
        System.out.println(solutionTLE.exist(boards, "ABCCEDDD"));
    }
}
