package $392;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 2:16 PM 2/28/19.
 */
public class Solution {
    public boolean isSubsequence(String s, String t){
        char[] chars = s.toCharArray();
        int index = -1;
        for (char c : chars){
            index = t .indexOf(c, index+1);
            if (index == -1){
                return false;
            }
        }
        return true;
    }
}
