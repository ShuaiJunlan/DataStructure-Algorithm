package testing.nowcoder1.q2;


import java.util.Scanner;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:35 PM 2/20/19.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++){
            int N = scanner.nextInt();
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            N -= (C / 2);
            C %= 2;

            N -= (B / 3);
            B %= 3;

            N -= (A / 6);
            A %= 6;

            if (A == 0){
                System.out.println(N<=0 ? "Yes" : "No");
            }else {
                N -= ((C*3 + B*2 + A) / 6);
                System.out.println(N<=0 ? "Yes" : "No");
            }


        }
    }
}
