package $290;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 4:03 PM 4/19/19.
 */
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if (pattern == null || pattern.length() == 0 || str == null || str.length() == 0){
            return false;
        }
        Set<String> set = new HashSet<>();
        String[] strs = str.split(" ");
        if (strs.length != pattern.length()){
            return false;
        }
        int[] letters = new int[26 + 1];
        for (int i = 0; i < pattern.length(); i++){
            int temp;
            if ((temp = letters[pattern.charAt(i) - 'a' + 1]) != 0){
                if (!strs[i].equals(strs[temp-1])){
                    return false;
                }
            }else {
                if (!set.add(strs[i])){
                    return false;
                }
                letters[pattern.charAt(i) - 'a' + 1] = i + 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.wordPattern("abba", "dog cat cat dog");
    }
}
