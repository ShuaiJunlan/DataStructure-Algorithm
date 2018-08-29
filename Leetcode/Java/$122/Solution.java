package $122;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 20:58 2018/8/29.
 */
public class Solution {
    public int maxProfit(int[] prices){
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++){
            if (prices[i + 1] > prices[i]){
                total += (prices[i+1] - prices[i]);
            }
        }
        return total;
    }
}
