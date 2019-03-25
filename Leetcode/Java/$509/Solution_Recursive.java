package $509;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 1:49 PM 3/25/19.
 */
public class Solution_Recursive {
    public int fib(int N){
        if (N <= 1){
            return N;
        }else {
            return fib(N-1) + fib(N-2);
        }
    }
}
