package $076;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 4:02 PM 8/30/19.
 */
public class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0){
            return "";
        }
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (char c : t.toCharArray()){
            characterIntegerMap.put(c, characterIntegerMap.getOrDefault(c, 0) + 1);
        }
        int minLeft = 0, minRight = 0, count = t.length(), i = 0, j = 0, minLength = s.length();
        boolean flag = false;
        for (char c : s.toCharArray()){
            if (characterIntegerMap.containsKey(c)){
                characterIntegerMap.put(c, characterIntegerMap.get(c)-1);
               if (characterIntegerMap.get(c) >= 0){
                   count--;
               }
            }
            while (count == 0 && minLeft <= minRight){
                flag = true;
                int curLen = j + 1 - i;
                if (curLen <= minLength){
                    minLeft = i;
                    minRight = j;
                    minLength = curLen;
                }
                char temp = s.charAt(i);
                if (characterIntegerMap.containsKey(temp)){
                    characterIntegerMap.put(temp, characterIntegerMap.get(temp) + 1);
                    if (characterIntegerMap.get(temp) >= 1){
                        count++;
                    }
                }
                i++;
            }
            j++;
        }
        return flag ? s.substring(minLeft, minRight+1) : "";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.minWindow("aaa", "a");
    }
}
