package $367;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:37 PM 10/30/19.
 */
public class Solution3 {
    public boolean isPerfectSquare(int num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x) >> 1;
        }
        return x * x == num;
    }
}
