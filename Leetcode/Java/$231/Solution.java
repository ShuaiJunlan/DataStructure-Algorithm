package $231;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:56 PM 4/12/19.
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        int temp = 1;
        for (int i = 0; i < 31; i++){
            if (temp == n){
                return true;
            }else if (temp > n){
                return false;
            }else {
                temp <<= 1;
            }
        }
        System.out.println(temp);
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPowerOfTwo(1073741824);
    }
}
