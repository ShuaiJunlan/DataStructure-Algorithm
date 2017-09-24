package com.sh.leetcoder.$121;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:08 2017/5/10.
 */

/**
 * Simple description:
 * get the max value of (jth - ith)(ie,must satisfy j > i), if the max value falls below 0 at last,<br>
 *     then return 0 in directly;
 */
public class Solution1 {
    public int maxProfit(int[] prices){
        if (prices == null || prices.length == 0) return 0;
        int maxValue = 0;                           //  store the max value
        int currentValue = prices[0];
        for (int i = 0; i < prices.length; i++){
            if (prices[i] > currentValue){                          //  if prices[i] is greater than currentValue, it means that can get profit;
                int temp = prices[i] - currentValue;
                maxValue = maxValue > temp ? maxValue : temp;       //  get the max value
            }else {                                                 //  if prices[i] is not greater than currentValue, it means that can get smaller currentValue(ie,buy value)
                currentValue = prices[i];                           //  change the current value(ie,buy value)
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
    }
}