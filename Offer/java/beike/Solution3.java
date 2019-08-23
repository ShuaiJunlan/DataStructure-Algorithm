package beike;

import java.util.Scanner;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:36 PM 8/23/19.
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long m = scanner.nextLong();
        int[][] beike = new int[n][];
        for (int i = 0; i < n; i++){
            beike[i] = new int[2];
            beike[i][0] = scanner.nextInt();
            beike[i][1] = scanner.nextInt();
        }

        long maxCount = 0;
        for (int j = 0; j < n; j++){
            if (m <= 0){
                break;
            }
            long temp = m / beike[j][1];
            if (temp <= beike[j][0]){
                maxCount += temp;
                m -= (temp * beike[j][1]);
            }else {
                maxCount += beike[j][0];
                m -= ((long) beike[j][0] * beike[j][1]);
            }
        }
        System.out.println(maxCount);
    }
}
