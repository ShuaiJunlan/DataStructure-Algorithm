package bytedance.solution1;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++){
            h[i] = sca.nextInt();
        }

        int[] c = new int[h.length];
        for (int i = 1; i < h.length; i++){
            for (int j = i-1; j >= 0; j--){
                if (h[j] >= h[i]){
                    c[j]++;
                    break;
                }
            }
        }
        int max = -1, value = -1, i = 0;
        for (int a : c){
            if (a > max){
                max = a;
                value = h[i];
            }
            i++;
        }
        System.out.println(value);
    }
}
