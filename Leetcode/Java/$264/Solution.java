package $264;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 6:19 PM 4/29/19.
 */
public class Solution {
    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        int factor2 = 2, factor3 = 3, factor5 = 5;
        int index2 = 0, index3 = 0, index5 = 0;
        for (int i = 1; i < n; i++){
            int min = Math.min(factor2, Math.min(factor3, factor5));
            arr[i] = min;
            if (min == factor2){
                factor2 = 2 * arr[++index2];
            }
            if (min == factor3){
                factor3 = 3 * arr[++index3];
            }
            if (min == factor5){
                factor5 = 5 * arr[++index5];
            }
        }
        return arr[n-1];
    }
}
