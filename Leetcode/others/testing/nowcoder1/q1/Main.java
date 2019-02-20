package testing.nowcoder1.q1;

import java.util.Scanner;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:24 PM 2/20/19.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int f = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();

        if (f >= d / x){
            System.out.println(d / x);
        }else {
            int remain = d - x * f;
            System.out.println(f + remain / (p + x));
        }
    }
}
