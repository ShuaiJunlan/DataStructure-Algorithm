package $008;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:23 2017/10/18.
 */
public class Solution {
    public int myAtoi(String str) {
        int sum = 0;
        int flag = 0;
        int start = 0;
        if (str == null || str.length() == 0) {
            return 0;
        }
        char[] num = str.toCharArray();
        if (str.length() == 1 && num[0] >= '0' && num[0] <= '9'){
            return num[0] - '0';
        }
        else if (str.length() == 1){
            return 0;
        }else {
            int non_num = 0;
            for (int i = str.length() - 1; i >= 0; i--){

                if (num[i] == '-'){
                    if (flag != 0){
                        return 0;
                    }
                    flag = (flag^1) * (-1);
                }else if (num[i] == '+'){
                    if (flag != 0){
                        return 0;
                    }
                    flag = (flag^1);
                }else if (num[i] > '9' || num[i] < '0'){
                    non_num++;
                }else {
                    if (Integer.MAX_VALUE - sum < Math.pow(10, str.length() - i - 1 - non_num) *  (num[i] - '0')){
                        return (1&flag) == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    sum += (Math.pow(10, str.length() - i - 1 - non_num) * (num[i] - '0'));
                }

            }

        }
        return sum*(flag == 0 ? 1 : flag);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String a = "-1234567";
        System.out.println(solution.myAtoi(a));
        String b = " -  dfa45fasdf";
        System.out.println(solution.myAtoi(b));
        String c = "-a1 232  13";
        System.out.println(solution.myAtoi(c));
        String d = "100 -   123";
        System.out.println(solution.myAtoi(d));
        String e = "+-2";
        System.out.println(solution.myAtoi(e));

    }
}
