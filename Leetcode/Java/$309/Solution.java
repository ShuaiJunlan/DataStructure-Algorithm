package $309;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 6:35 PM 5/4/19.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0, prevSell = 0, buy = Integer.MIN_VALUE, prevBuy;
        for (int price : prices) {
            prevBuy = buy;
            buy = Math.max(prevSell - price, prevBuy);
            prevSell = sell;
            sell = Math.max(prevBuy + price, prevSell);
        }
        return sell;
    }
}
