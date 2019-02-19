package $171;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:58 PM 2/19/19.
 */
public class Solution {
    public int titleToNumber(String s){
        assert s != null && s.length() != 0;
        int num = (s.charAt(0) - 'A') + 1;
        for (int i = 1; i < s.length(); i++){
            num = (num * 26) + (s.charAt(i) - 'A') + 1;
        }
        return num;
    }
}
