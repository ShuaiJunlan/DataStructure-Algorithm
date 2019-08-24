package $121;

public class SolutionNew {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0){
            return 0;
        }
        int max = 0, currentValue = prices[0];
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > currentValue){
                max = Math.max(max, prices[i] - currentValue);
            }else {
                currentValue = prices[i];
            }
        }
        return max;
    }
}
