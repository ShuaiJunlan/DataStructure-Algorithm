package $541;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 11:14 2017/3/14.
 */
public class Solution {
    public String reverseStr(String s, int k) {
        if (s == null)
            return null;
        if (k <= 0)
            return s;
        char[] str = s.toCharArray();
        int length = str.length;
        int start = 0;
        while (length > 0) {
            if (length >= k) {
                reverseChar(str, start, start + k - 1);
                length -= k;
                start += k;
                if (length >= k) {
                    length -= k;
                    start += k;
                } else
                    return String.valueOf(str);
            } else {
                reverseChar(str, start, length + start - 1);
                return String.valueOf(str);
            }
        }
        return String.valueOf(str);

    }

    public String reverseStr2(String s, int k) {
        if (s == null)
            return null;
        if (k <= 0)
            return s;
        char[] str = s.toCharArray();
        int i = 0;
        while (i < str.length) {
            int temp = Math.min(str.length - i - 1, k - 1);
            reverseChar(str, i, i + temp);
            i += (k << 1);
        }
        return String.valueOf(str);
    }

    public void reverseChar(char[] str, int x, int y) {
        while (x < y) {
            str[x] = (char) (str[x] + str[y]);
            str[y] = (char) (str[x] - str[y]);
            str[x] = (char) (str[x] - str[y]);
            x++;
            y--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseStr("abcdefg", 2));
        System.out.println(solution.reverseStr("abcdefghijklmnopqrstuv", 5));

        System.out.println(solution.reverseStr2("abcdefg", 2));
        System.out.println(solution.reverseStr2("abcdefghijklmnopqrstuv", 5));
    }
}
