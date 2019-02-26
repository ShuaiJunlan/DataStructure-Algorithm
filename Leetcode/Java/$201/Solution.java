package $201;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:11 AM 2/26/19.
 */
public class Solution {
    public int rangeBitwiseAnd(int m, int n){
        if (m == 0){
            return 0;
        }
        int moveFactor = 1;
        while (m != n){
            m >>= 1;
            n >>= 1;
            moveFactor <<= 1;
        }
        return m * moveFactor;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rangeBitwiseAnd(5, 7));
    }
}
