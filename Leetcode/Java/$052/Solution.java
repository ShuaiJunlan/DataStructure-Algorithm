package $052;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 5:16 PM 8/30/19.
 */
public class Solution {
    private int count;
    public int totalNQueens(int n) {
        boolean[] columns = new boolean[n];
        boolean[] flag1 = new boolean[2 * n];
        boolean[] flag2 = new boolean[2 * n];
        help(0, columns, flag1, flag2, n, 0);
        return count;

    }
    private void help(int row, boolean[] columns, boolean[] flag1, boolean[] flag2, int n, int step){
        if (step == n){
            count++;
            return;
        }
        for (int col = 0; col < n; col++){
            int id1 = col - row + n;
            int id2 = col + row;
            if (columns[col] || flag1[id1] || flag2[id2]){
                continue;
            }
            columns[col] = true;
            flag1[id1] = true;
            flag2[id2] = true;
            help(row + 1, columns, flag1, flag2, n, step+1);
            columns[col] = false;
            flag1[id1] = false;
            flag2[id2] = false;
        }
    }
}
