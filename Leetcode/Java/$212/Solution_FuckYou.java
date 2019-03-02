package $212;

import java.util.*;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 6:36 PM 3/2/19.
 *
 *
 *
 * todo: ???????????????????????????????
 */
public class Solution_FuckYou {
    class Position{
        int x;
        int y;
        Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> re = new HashSet<>();
        if (words == null || words.length == 0){
            return new ArrayList<>(re);
        }
        HashMap<Character, List<Position>> hashMap = new HashMap<>(26);
        position(hashMap, board);


        for (String s : words){
            if (s.length() == 0){
                continue;
            }
            if (re.contains(s)){
                continue;
            }
            char a = s.charAt(0);
            List<Position> list = hashMap.get(a);
            if (list == null){
                continue;
            }
            boolean[][] mark = new boolean[board.length][board[0].length];
            for (Position p : list){
                if (bfs(board, s, 0, p.x, p.y, board.length, board[0].length, mark)){
                    re.add(s);
                    break;
                }
            }

        }
        return new ArrayList<>(re);
    }
    private void position(HashMap<Character, List<Position>> map, char[][] board){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (map.containsKey(board[i][j])){
                    map.get(board[i][j]).add(new Position(i, j));
                }else {
                    List<Position> positions = new ArrayList<>();
                    positions.add(new Position(i, j));
                    map.put(board[i][j], positions);
                }

            }
        }
    }
    private boolean bfs(char[][] board, String word, int index, int i, int j, int rows, int columns, boolean[][] positions){

        if (board[i][j] == word.charAt(index)){
            if (index == word.length()-1){
                return true;
            }
        }else {
            return false;
        }
        boolean up = false, down = false, left = false, right = false;
        positions[i][j] = true;
        //up
        if (i < rows-1 && !positions[i+1][j]){
            up = bfs(board, word, index+1, i+1, j, rows, columns, positions);

        }
        //down
        if (i > 0  && !positions[i-1][j]){
            down = bfs(board, word, index+1, i-1, j, rows, columns, positions);
        }
        //left
        if (j > 0 && !positions[i][j-1]){
            left = bfs(board, word, index+1, i, j-1, rows, columns, positions);

        }
        //right
        if (j < columns-1 && !positions[i][j+1]){
            right = bfs(board, word, index+1, i, j+1, rows, columns, positions);

        }
        positions[i][j] = false;
        return up || down || left || right;
    }
}
