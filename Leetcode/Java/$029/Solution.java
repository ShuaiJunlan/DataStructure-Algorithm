package $029;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:08 2018/4/18.
 *
 * Time Limit Exceeded
 */
public class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        int k = 0;
        int sum = divisor;
        int sign = (dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0) ? 1 : -1;
        if (dividend < 0 || divisor < 0){
            dividend = dividend < 0 ? dividend : -dividend;
            divisor = divisor < 0 ? divisor : -divisor;
            sum = divisor;
            while (sum >= dividend){
                if (Integer.MIN_VALUE - sum <= divisor){
                    sum += divisor;
                    k++;
                }else {
                    k++;
                    break;
                }
            }
        }else {
            while (sum <= dividend){
                if (Integer.MAX_VALUE - sum >= divisor){
                    sum += divisor;
                    k++;
                }else {
                    k++;
                    break;
                }
            }
        }
        return k * sign;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.divide(10, 2));
        System.out.println(solution.divide(1, 1));
        System.out.println(solution.divide(0, 2));
        System.out.println(solution.divide(-10, -2));
        System.out.println(solution.divide(Integer.MIN_VALUE, -3));
        System.out.println(solution.divide(Integer.MAX_VALUE, 3));
        System.out.println(Integer.MIN_VALUE/3);
        System.out.println();
    }
}
