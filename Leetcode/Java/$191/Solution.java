package $191;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:00 AM 2/19/19.
 *
 * {@link java.lang.Integer#bitCount(int i)}
 */
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i=0; i < Integer.BYTES * 8; i++){
            if ((n&1) == 1){
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }
}
