package $172;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 2:48 PM 2/24/19.
 */
public class Solution {
    public int trailingZeroes(int n){
         return n == 0 ? 0 : n / 5 + trailingZeroes(n/5);
    }
}
