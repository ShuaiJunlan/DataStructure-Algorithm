package $038;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 8:47 2018/3/15.
 */
public class Solution {
    public String countAndSay(int n){
        if (n <= 0){
            return "-1";
        }

        StringBuilder stringBuilder = new StringBuilder("1");
        if (n == 1){
            return stringBuilder.toString();
        }
        for (int i = 1; i < n; i++){
            String temp = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            for (int j = 0; j < temp.length();){
                int k = 1;
                while ((j+k) < temp.length() && temp.charAt(j) == temp.charAt(j+k)){
                    k++;
                }
                stringBuilder.append(String.valueOf(k)).append(String.valueOf(temp.charAt(j)));
                j += k;
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(1));
        System.out.println(solution.countAndSay(2));
        System.out.println(solution.countAndSay(3));
        System.out.println(solution.countAndSay(4));
        System.out.println(solution.countAndSay(5));
    }
}
