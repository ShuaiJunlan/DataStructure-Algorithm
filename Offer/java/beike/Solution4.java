package beike;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:51 PM 8/23/19.
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        int[] dp = new int[100 * 100];
        for (int i = 0; i < n; ++i) {
            for (int j = sum / 2; j >= arr[i]; --j) {
                dp[j] = Math.max(dp[j], dp[j - arr[i]] + arr[i]);
            }
        }
        System.out.println(sum - 2 * dp[sum/2]);

        // int temp = dp[]
    }
}
