package pinduoduo.solution4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), k = scanner.nextInt();
        int[] arr = new int[m * n];
        int count = 0;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                arr[count] = i * j;
                count++;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length - k]);
//        bfs(n, m, k);
    }
    private static void bfs(int n, int m, int k){
        if (k == 0){
            System.out.println(m * n);
            return;
        }
        if ((n-1) * m > n * (m-1)){
            bfs(n-1, m, k-1);
        }else {
            bfs(n, m-1, k-1);
        }
    }
}
