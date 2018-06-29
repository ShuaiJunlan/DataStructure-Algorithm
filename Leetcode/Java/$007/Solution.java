package $007;

import java.util.Scanner;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:00 2017/3/15.
 */
public class Solution {
    public int reverse(int x) {
        char[] str = String.valueOf(x).toCharArray();
        int start = 0, end = str.length - 1;
        if (x < 0)
            start = 1;                      //  注意负数的负号
        char temp;
        while (start < end) {
            temp = str[end];
            str[end] = str[start];
            str[start] = temp;
            end--;
            start++;
        }
        String str1 = new String(str), str_max = String.valueOf(Integer.MAX_VALUE);
        if (x < 0)
            str1 = new String(str).substring(1);
        if (str1.length() == str_max.length() && str1.compareTo(str_max) > 0)
            return 0;
        return Integer.valueOf(new String(str));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(2147447));

//        Scanner scanner = new Scanner(System.in);
//        int x = 2054654654;
//        System.out.println(String.valueOf(Integer.MAX_VALUE));
//        if (x > Integer.MAX_VALUE)
//            System.out.println(true);
//        else
//            System.out.println(false);
    }
}
