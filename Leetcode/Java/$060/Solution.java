package $060;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:34 AM 2018/07/20.
 */
public class Solution {
    public String getPermutation(int n, int k){
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n+1];
        StringBuilder stringBuilder = new StringBuilder();

        factorial[0] = 1;
        for (int i = 1; i <= n; i++){
            factorial[i] = i == 1 ? 1 : factorial[i-1]*i;
        }

        for (int i = 1; i <= n; i++){
            numbers.add(i);
        }

        k--;

        for (int i = 1; i <= n; i++){
            int index = k / factorial[n-i];
            stringBuilder.append((char)(numbers.get(index) + '0'));
            numbers.remove(index);
            k -= index * factorial[n-i];
        }
        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.getPermutation(9, 362880);
        int num = 1;
        for (int i = 1; i <= 9; i++){
            num *= i;
        }
        System.out.println(num);
    }
}
