package $509;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 1:54 PM 3/25/19.
 *
 * TODO: reference https://leetcode.com/problems/fibonacci-number/discuss/223199/Java-O(2N)-greater-O(N)-greater-O(logN)
 */
public class Solution_LogN {
    public int fib(int N){
        if (N <= 1){
            return N;
        }
        int[][] I = new int[][]{{1, 0}, {0, 1}};
        int[][] E = new int[][]{{1, 1}, {1, 0}};
        int[][] re = new int[][]{{1, 0}};

        N -= 1;
        while (N > 0){
            if ((N & 1) == 1) {
                I = multiply(I, E);
            }
            E = multiply(E, E);
            N >>= 1;
        }
        re = multiply(re, I);
        return re[0][0];
    }
    private int[][] multiply(int[][] a, int[][] b){
        int[][] re = new int[a.length][b[0].length];
        for (int i = 0; i < re.length; i++){
            for (int j = 0; j < re[0].length; j++){
                for (int k = 0; k < b[0].length; k++){
                    re[i][k] += a[i][j] * b[j][k];
                }
            }
        }
        return re;
    }
}
