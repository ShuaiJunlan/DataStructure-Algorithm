package $003;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:21 2018/3/19.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s){
        if (s == null){
            return 0;
        }
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        int temp =  -1;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++){
            if (characterIntegerMap.containsKey(s.charAt(i)) && characterIntegerMap.get(s.charAt(i)) > temp){
                maxLength = maxLength > i - temp - 1 ? maxLength : i - temp - 1;
                temp = characterIntegerMap.get(s.charAt(i));
            }else {
                maxLength = maxLength > i - temp ? maxLength : i - temp;
            }
            characterIntegerMap.put(s.charAt(i), i);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("eee"));
        System.out.println(solution.lengthOfLongestSubstring("eeekk"));
        System.out.println(solution.lengthOfLongestSubstring("abcdefg"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
        System.out.println(solution.lengthOfLongestSubstring(""));
        System.out.println(solution.lengthOfLongestSubstring("a"));
        System.out.println(solution.lengthOfLongestSubstring("abba"));
        System.out.println(solution.lengthOfLongestSubstring("tmmzuxt"));
    }
}
