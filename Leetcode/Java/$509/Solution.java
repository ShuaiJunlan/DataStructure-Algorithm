package $509;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 1:43 PM 3/25/19.
 */
public class Solution {
    public int fib(int N) {
        if (N == 0){
            return 0;
        }
        int a = 0, b = 1, temp = 0;
        for (int i = 2; i <= N; i++){
            temp = b;
            b += a;
            a = temp;
        }
        return b;
    }
}
