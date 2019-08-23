package $008;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:20 PM 8/23/19.
 */
public class SolutionNew {
    private static final int INT_MIN = Integer.MIN_VALUE;
    private static final int INT_MAX = Integer.MAX_VALUE;
    public int myAtoi(String str) {
        if (str == null || str.length() == 0){
            return 0;
        }
        char[] chars = str.toCharArray();
        int value = 0;
        int sign = 1;
        boolean start = false, overflow = false;
        for (char aChar : chars) {
            if (aChar == ' ' && !start) {
                continue;
            } else if ((aChar == '+' || aChar == '-') && !start) {
                sign = aChar == '-' ? -1 : 1;
                start = true;
            } else if (Character.isDigit(aChar)) {
                if ((INT_MAX - (aChar - '0')) / 10 >= value){
                    value = value * 10 + (aChar - '0');
                }else {
                    overflow = true;
                    break;
                }
                start = true;
            } else {
                break;
            }
        }
        if (overflow){
            return sign == -1 ? INT_MIN : INT_MAX;
        }
        return sign * value;
    }
}
