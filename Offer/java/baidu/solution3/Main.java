package baidu.solution3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] count = new int[n+1];
        int[][] edges = new int[n+1][n+1];

        for (int i = 1; i < n; i++){
            int m = scanner.nextInt(), k = scanner.nextInt();
            edges[m][k] = 1;
            edges[k][m] = 1;
            count[m]++;
            count[k]++;
        }

        int[] result = new int[n+1];
        int times = 1;
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 1; i <= n; i++){
                if (count[i] == 1){
                    result[i] = times;
                    count[i]--;
                    update(edges, count, i);
                    flag=true;
                }
            }
            times++;
        }
        for (int i = 1; i <= n; i++){
            if (result[i] == 0){
                System.out.println(times-1);
            }else {
                System.out.println(result[i]);
            }
        }

    }
    private static void update(int[][] edges, int[] count, int i){
        for (int j = 1; j < count.length; j++){
            if (edges[j][i] == 1){
                count[j]--;
            }
        }
    }
}
