package $292;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:02 PM 4/30/19.
 *
 * https://leetcode.com/problems/nim-game/discuss/73749/Theorem%3A-all-4s-shall-be-false
 */
public class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0 ;
    }
}
