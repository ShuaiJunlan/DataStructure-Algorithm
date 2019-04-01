package $121;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:55 2017/5/10.
 */

/**
 * TLE
 */
public class Solution_TLE {
    public int maxProfit(int[] prices) {
        int maxValue = 0;
        if (prices == null || prices.length == 0)
            return maxValue;
        for (int i = 0; i < prices.length; i++)
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    int temp = prices[j] - prices[i];
                    maxValue = maxValue > temp ? maxValue : temp;
                }
            }
        return maxValue;
    }
}
