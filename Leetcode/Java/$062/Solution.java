package $062;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:05 2018/5/31.
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1){
            return 1;
        }
        return select((m - 1) + (n - 1), Math.min(m-1, n-1));
    }
    public int select(int n, int k){
        long value1 = 1, value2 = 1;
        while (k > 0){
            value2 *= k;
            k--;
            value1 *= (n - k);
        }
        return (int) (value1 / value2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.uniquePaths(10, 10));
    }
}
