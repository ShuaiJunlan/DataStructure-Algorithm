package $190;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:46 PM 2/25/19.
 */
public class Solution {
    public int reverseBits(int n){
        int re = 0;
        int length = Integer.BYTES * 8;
        for (int i = 0; i < length; i++){
            if ((n & 1) == 1){
                re ^= (1 << length - i - 1);
            }
            n >>>=1;
        }
        return re;
    }
}
