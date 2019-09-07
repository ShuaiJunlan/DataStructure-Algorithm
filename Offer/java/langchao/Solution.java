package langchao;

import java.util.Scanner;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:27 PM 9/2/19.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = scanner.nextInt();
        }

        int len = lis1(num);
        System.out.println(Math.min(len, n - len));
    }
    // private static int lis(int[] array){
    //     int length=array.length;
    //     if (length ==0)
    //         return 0;
    //     int maxCount=0;
    //     int[] dp=new int[length];
    //     for(int i =0;i<length;i++){
    //         dp[i]=1;
    //         for(int j =0;j<i;j++){
    //             if(array[j]<array[i])
    //                 dp[i]= Math.max(dp[i], dp[j] + 1);
    //             if(maxCount<dp[i])
    //                 maxCount=dp[i];
    //         }
    //     }
    //     return maxCount;
    // }
    private static int lis1(int[] array){
        int maxLen = 0, temp = 1;
        for (int value : array) {
            if (value == temp) {
                maxLen++;
                temp++;
            }
        }
        return Math.max(maxLen, array.length-maxLen);
    }
}
