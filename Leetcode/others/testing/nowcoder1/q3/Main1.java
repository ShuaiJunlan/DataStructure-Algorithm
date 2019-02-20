package testing.nowcoder1.q3;

import java.util.Scanner;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:31 PM 2/20/19.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int S = scanner.nextInt();
        int T = scanner.nextInt();

        int[][] metrix = new int[N][N];

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            metrix[a - 1][b - 1] = c;
        }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == j || i == k || j == k)
                        continue;
                    if (metrix[i][k] != 0 && metrix[k][j] != 0) {
                        int total = metrix[i][k] + metrix[k][j];
                        if (total < metrix[i][j] || metrix[i][j] == 0)
                            metrix[i][j] = total;

                    }

                }

            }
        }
        System.out.println(metrix[S-1][T-1] + metrix[T-1][S-1]);
    }
}
