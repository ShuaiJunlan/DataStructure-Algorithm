package $066;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 12:36 2018/5/19.
 */

/**
 * wrong answer
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0){
            return digits;
        }
        int len = digits.length - 1;
        int sum = digits[len] + 1;
        int[] re;
        if (sum > 9){
            while (sum > 9 && len > 0){
                digits[len] = sum % 10;
                sum = sum / 10;
                sum = sum + digits[--len];
            }
        }else {
            digits[len] = sum;
        }

        if (sum > 9){
            re = new int[digits.length + 1];
            re[0] = 1;
        }else {
            digits[len] = sum;
            re = digits;
        }
        return re;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        solution.plusOne(a);
        System.out.println(Long.MAX_VALUE);
    }
}
