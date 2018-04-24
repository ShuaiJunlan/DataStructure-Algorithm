package $005;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 20:25 2018/3/19.
 */
public class Solution {

    private int maxLength = 0;
    private int lo = 0;

    public String longestPalindrome(String s) {
        maxLength = 0;
        lo = 0;
        if (s == null || s.length() <= 1){
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++){
            extendPalindrome(i, i, s);
            extendPalindrome(i, i+1, s);
        }
        return s.substring(lo, lo + maxLength);
    }
    private void extendPalindrome(int a, int b, String s){
        while (a >= 0 && b < s.length() && s.charAt(a) == s.charAt(b)){
            a--;
            b++;
        }
        if (b - a - 1> maxLength){
            lo = a + 1;
            maxLength = b - a - 1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("1"));
        System.out.println(solution.longestPalindrome("abba"));
        System.out.println(solution.longestPalindrome("babad"));
        System.out.println(solution.longestPalindrome("cbbd"));
    }
}
