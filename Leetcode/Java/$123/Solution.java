package $123;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:52 AM 2018/09/22.
 */
public class Solution {
    public int maxProfit(int[] prices){
        int buyOne = Integer.MAX_VALUE, sellOne = 0, buyTwo = Integer.MAX_VALUE, sellTwo = 0;
        for (int p : prices){
            buyOne = Math.min(buyOne, p);
            sellOne = Math.max(sellOne, p - buyOne);
            buyTwo = Math.min(buyTwo, p - sellOne);
            sellTwo = Math.max(sellTwo, p - buyTwo);
        }
        return sellTwo;
    }
}
