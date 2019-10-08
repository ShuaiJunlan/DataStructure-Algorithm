package $1217;

import java.lang.Math;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:23 PM 10/8/19.
 */
public class Solution {
    public int minCostToMoveChips(int[] chips) {
        int odd = 0, even = 0;
        for (int chip : chips) {
            if ((chip % 2 == 1)) {
                odd++;
            } else {
                even++;
            }
        }
        return Math.min(odd, even);
    }
}
