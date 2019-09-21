package $552;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 5:08 PM 9/8/19.
 */
public class Solution_TLE {
    private int count = 0;
    public int checkRecord(int n) {
        count = 0;
        dfs(0, 0, ' ', ' ', n);
        return count;
    }
    private void dfs(int step, int aCount, char pre, char prePre, int n){
        if (step == n){
            count++;
            return;
        }
        if (step > n){
            return;
        }
        dfs(step+1, aCount, 'P', pre, n);
        if (aCount < 1){
            dfs(step+1, aCount + 1, 'A', pre, n);
        }
        if (!(pre == 'L' && prePre == 'L')){
            dfs(step+1, aCount, 'L', pre, n);
        }
    }
}
