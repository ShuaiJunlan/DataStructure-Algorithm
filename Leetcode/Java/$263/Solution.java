package $263;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 4:26 PM 4/21/19.
 */
public class Solution {
    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        if (num == 1){
            return true;
        }
        while ((num & 1) == 0) {
            num >>= 1;
            if (num == 1) {
                return true;
            }
        }
        while ((num % 3) == 0) {
            num /= 3;
            if (num == 1) {
                return true;
            }
        }
        while ((num % 5) == 0) {
            num /= 5;
            if (num == 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isUgly(6);
    }
}
