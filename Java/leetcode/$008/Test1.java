package $008;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:30 2017/10/18.
 */
public class Test1 {
    public int myAtoi(String str) {
        int N = str.length();
        if (N == 0) {
            return 0;
        }
        boolean isNeg = false, overflow = false;
        int i = 0;
        while (i < N && str.charAt(i) == ' ') {
            i++;
        }
        if (i == N) {
            return 0;
        }

        if (str.charAt(i) == '-' || str.charAt(i) == '+') {
            isNeg = (str.charAt(i) == '-');
            i++;
        }
        int n = 0;
        while (i < N) {
            char c = str.charAt(i);
            if (c > '9' || c < '0') {
                break;
            }
            int digit = c - '0';
            //-MIN_VALUE equals to MIN_VALUE
//            if (isNeg && (Integer.MIN_VALUE+digit)/10 <= -n ||
//                    !isNeg && (Integer.MAX_VALUE-digit)/10 >= n) {
//                n = 10*n+digit;
//            }
            if ((Integer.MAX_VALUE - digit)/10 >= n){
                n = 10*n+digit;
            }
            else {
                overflow = true;
                break;
            }
            i++;
        }
        int result = 0;
        if (isNeg) {
            result = overflow ? Integer.MIN_VALUE : -n;
        } else {
            result = overflow ? Integer.MAX_VALUE : n;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
