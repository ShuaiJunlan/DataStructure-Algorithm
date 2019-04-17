package $242;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:56 PM 4/17/19.
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null){
            return false;
        }
        int[] counts = new int[26];
        for (char c : s.toCharArray()){
            counts[c-'a']++;
        }
        for (char c : t.toCharArray()){
            if (counts[c-'a'] == 0){
                return false;
            }
            counts[c-'a']--;
        }
        for (int i : counts){
            if (i > 0){
                return false;
            }
        }
        return true;

    }
}
