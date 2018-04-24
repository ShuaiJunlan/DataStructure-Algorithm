package $008;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:23 2017/10/18.
 */
public class Solution {
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
            if ((Integer.MAX_VALUE - digit) / 10 >= n){
                n = 10 * n + digit;
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
        Solution solution = new Solution();
        String a = "-1234567";
        System.out.println(solution.myAtoi(a));
        String b = " -  dfa45fasdf";
        System.out.println(solution.myAtoi(b));
        String c = "-a1 232  13";
        System.out.println(solution.myAtoi(c));
        String d = "100 -   123";
        System.out.println(solution.myAtoi(d));
        String e = "+-2";
        System.out.println(solution.myAtoi(e));

    }
}
