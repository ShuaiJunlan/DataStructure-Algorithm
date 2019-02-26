package $204;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:33 AM 2/26/19.
 */
public class Solution {
    public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++){
            if (!notPrimes[i]){
                count++;
                for (int j = 2; i*j < n; j++){
                    notPrimes[i*j] = true;
                }
            }
        }
        return count;
    }
}
