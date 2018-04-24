package $070;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 21:31 2017/3/13.
 */
public class Solution {
    public int climbStairs(int n) {
        int[] a = {1, 2};
        if (n == 0)
            return 0;
        if (n == 1)
            return a[0];
        if (n == 2)
            return a[1];
        int e = 0;
        for (int i = 3; i <= n; i++) {
            a[e] = a[e] + a[1 - e];
            e = 1 - e;
        }
        return a[1 - e];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(10));
    }
}
