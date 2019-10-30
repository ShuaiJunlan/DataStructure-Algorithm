package $367;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:11 PM 10/28/19.
 */
public class Solution2 {
    public boolean isPerfectSquare(int num) {
        int low = 0, high = num;
        while (low <= high){
            long mid = (low+high) >> 1;
            if (mid * mid == num){
                return true;
            } else if (mid * mid < num){
                low = (int)mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;
    }
}
