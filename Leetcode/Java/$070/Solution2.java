package $070;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:59 2017/5/3.
 */
public class Solution2 {
    public int climbStairs(int n) {
        if (n <= 0) return 0;
        int [][] init = {{1, 1}, {1, 0}};
        int [][] unitMatrix = {{1, 0}, {0, 1}};
        while (n != 0){
            if ((n & 1) == 1) unitMatrix = mutliMatrix(unitMatrix, init);
            init = mutliMatrix(init, init);
            n >>= 1;
        }
        return unitMatrix[0][0];
    }
    public int[][] mutliMatrix(int[][] a, int [][] b){
        int [][] re = new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                re[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
        return re;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        solution2.climbStairs(2);
    }
}
