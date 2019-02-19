package $258;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:45 PM 2/19/19.
 */
public class Solution {
    public int addDigits(int num) {
        if (num < 10){
            return num;
        }
        int sum = 0;
        while (num > 0){
            sum += (num % 10);
            num /= 10;
        }
        return addDigits(sum);
    }
}
