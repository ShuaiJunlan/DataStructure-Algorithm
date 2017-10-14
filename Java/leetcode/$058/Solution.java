package $058;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 20:47 2017/3/13.
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0)
            return 0;
        String[] b = s.split(" ");
        if (b.length == 0)
            return 0;
        return b[b.length - 1].length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("hello world"));
        System.out.println(solution.lengthOfLastWord("hello "));
    }
}
