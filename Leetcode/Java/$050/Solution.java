package $050;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 18:20 2017/3/14.
 */
public class Solution {
    public double myPow(double x, int n) {
        double i = 1.0;
        if (n > 0) {
            while (n > 0) {
                if ((n & 1) == 1)
                    i *= x;
                x *= x;
                n >>= 1;
            }
        } else if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                x *= x;
                n >>= 1;
            }
            int n1 = -n;           //  当n为int所能表示的最小值时，-n也是其最小值
            while (n1 > 0) {
                if ((n1 & 1) == 1)
                    i *= x;
                x *= x;
                n1 >>= 1;
            }
            i = 1 / i;
        }
        return i;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myPow(2.00000, -2147483648));
    }
}
