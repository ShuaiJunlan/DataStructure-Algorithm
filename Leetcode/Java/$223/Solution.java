package $223;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 2:31 PM 4/8/19.
 */
public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int squareA = (C-A) * (D-B);
        int squareB = (G-E) * (H-F);

        long height = 0;
        long width = 0;
        if (A <= E){
            width = Math.max(width, Math.min((long) C-E, (long) G-E));
        }else {
            width = Math.max(width, Math.min((long) G-A, (long) C-A));
        }

        if (D >= H){
            height = Math.max(height, Math.min((long) H-B, (long) H-F));
        }else {
            height = Math.max(height, Math.min((long) D-F, (long) D-B));
        }
        return squareA + squareB - (int) (height*width);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // solution.computeArea(-3, 0, 3, 4, 0, -1, 9, 2);
        // System.out.println(solution.computeArea(0, 0, 0, 0, -1, -1, 1, 1));

        System.out.println(solution.computeArea(-1500000001, 0, -1500000000, 1, 1500000000, 0, 1500000001, 1));
    }
}
