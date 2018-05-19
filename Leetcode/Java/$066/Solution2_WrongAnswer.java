package $066;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 13:11 2018/5/19.
 */
public class Solution2_WrongAnswer {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0){
            return digits;
        }
        int len = digits.length - 1;
        int[] re;
        long num = 0;
        for (int i = len; i >= 0; i--){
            num += (digits[i] * Math.pow(10, len - i));
        }
        // plus one
        num += 1;
        if (Math.pow(10, digits.length) == num){
            re = new int[digits.length + 1];
            re[0] = 1;
        }else {
            for (int i = len; i >= 0; i--){
                digits[i] = (int) (num % 10);
                num /= 10;
            }
            re = digits;
        }
        return re;
    }
    public static void main(String[] args) {
        Solution2_WrongAnswer solution = new Solution2_WrongAnswer();
//        int[] a = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
//        solution.plusOne(a);
//
//        int[] b = {9,9,9,9,9};
//        solution.plusOne(b);

        int[] c = {8,9,9,9,9};
        solution.plusOne(c);
    }
}
