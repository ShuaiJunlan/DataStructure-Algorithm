/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 17:26 2017/2/4.
 */
public class $09 {
    public static long fibonacci(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
}
