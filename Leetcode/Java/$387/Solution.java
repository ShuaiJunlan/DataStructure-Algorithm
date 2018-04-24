package $387;


/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 18:58 2017/4/1.
 */
public class Solution {
    public int firstUniqChar(String s) {
        char[] str = new char[256];
        for (int i = 0; i < s.length(); i++) {
            str[(int) s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (str[(int) s.charAt(i)] == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("leetcode"));
    }
}
