package bytedance.solution1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++){
            heights[i] = scanner.nextInt();
        }
        System.out.println(getMaxSeesHeight(heights));
    }
    private static int getMaxSeesHeight(int[] arr){
        int[] counts = new int[arr.length];
        for (int i = 1; i < arr.length; i++){
            for (int j = i-1; j >= 0; j--){
                if (arr[j] >= arr[i]){
                    counts[j]++;
                    break;
                }
            }
        }
        int max = -1, maxHeight = -1, i = 0;
        for (int a : counts){
            if (a > max){
                max = a;
                maxHeight = arr[i];
            }
            i++;
        }
        return maxHeight;
    }
}
