package $389;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:54 2017/3/28.
 */
public class Solution {
    public char findTheDifference(String s, String t) {
        int[] num = new int[26];
        char[] s_chars = s.toCharArray();
        for (int i = 0; i < s_chars.length; i++) {
            num[s_chars[i] - 'a']++;
        }
        char[] t_chars = t.toCharArray();
        int i = 0;
        for (; i < t_chars.length; i++) {
            if (num[t_chars[i] - 'a'] <= 0)
                break;
            else
                num[t_chars[i] - 'a']--;
        }
        return t_chars[i];
    }
}
