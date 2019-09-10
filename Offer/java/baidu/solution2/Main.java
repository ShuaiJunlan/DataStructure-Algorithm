package baidu.solution2;

import java.util.Scanner;

public class Main {


    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        if (!is(n, k)) {
            System.out.println(1);
        } else {
            int[] temp = values(n, k);
            help(temp[0], temp[1], k);
            System.out.println(count);
        }
    }

    private static void help(int i, int j, int k) {
        if (!is(i, k)) {
            count++;
        } else {
//            if (i <= k) {
//                count++;
//                return;
//            }
            int[] temp = values(i, k);
            help(temp[0], temp[1], k);
        }

        if (!is(j, k)) {
            count++;
        } else {
//            if (j <= k) {
//                count++;
//                return;
//            }
            int[] temp = values(j, k);
            help(temp[0], temp[1], k);
        }
    }

    private static boolean is(int i, int k) {
        if (i <= k){
            return false;
        }
        return (i - k) % 2 == 0;
    }

    private static int[] values(int i, int k) {
        int[] re = new int[2];
        re[0] = ((i - k) >> 1);
        re[1] = re[0] + k;
        return re;
    }
}
