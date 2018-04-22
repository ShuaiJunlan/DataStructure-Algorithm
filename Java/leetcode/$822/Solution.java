package $822;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:44 2018/4/22.
 */
public class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        if (fronts == null || backs == null || fronts.length == 0 || backs.length == 0){
            return 0;
        }
        int min  = Integer.MAX_VALUE;
        boolean[] impossible = new boolean[2001];
        for (int j = 0; j < fronts.length; j++){
            if (fronts[j] == backs[j]){
                //when fronts[j] == backs[j]
                impossible[fronts[j]] = true;
            }
        }
        for (int j = 0; j < fronts.length; j++){
            if (!impossible[backs[j]]) {
                min = Math.min(min, backs[j]);
            }
            if (!impossible[fronts[j]]){
                min = Math.min(min, fronts[j]);
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
