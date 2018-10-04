package $135;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:24 2018/10/4.
 */
public class Solution {
    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0){
            return 0;
        }
        int[] num = new int[ratings.length];
        num[0] = 1;
        for (int i = 1; i < num.length; i++){
            num[i] = 1;
            if (ratings[i] > ratings[i-1]){
                num[i] = num[i-1] + 1;
            }
        }
        for (int i = ratings.length - 1; i > 0; i--){
            if (ratings[i-1] > ratings[i]){
                num[i-1] = Math.max(num[i-1], num[i]+1);
            }
        }
        int sum = 0;
        for (int a : num){
            sum += a;
        }
        return sum;
    }
}
