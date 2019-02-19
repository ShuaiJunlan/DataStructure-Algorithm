package $191;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:10 AM 2/19/19.
 */
public class Solution_BEST {
    public int hammingWeight(int n){
        int count = 0;
        while (n != 0){
            n &= (n-1);
            count++;
        }
        return count;
    }
}
