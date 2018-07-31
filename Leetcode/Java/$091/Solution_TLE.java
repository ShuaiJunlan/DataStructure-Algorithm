package $091;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:56 AM 2018/07/31.
 *
 * Time Limit Exceeded
 */
public class Solution_TLE {
    private int count;
    public int numDecodings(String s) {
        count = 0;
        recursive(s, 0);
        return count;
    }
    public void recursive(String s, int index){
        if (index == s.length()){
            count++;
            return;
        }
        for (int i = index + 1; i <= s.length(); i++){
            int value = Integer.valueOf(s.substring(index, i));
            if (value >= 1 && value <= 26){
                recursive(s, i);
            }else {
                break;
            }
        }
    }
}
