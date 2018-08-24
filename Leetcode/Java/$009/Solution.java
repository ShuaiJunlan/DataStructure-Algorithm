package $009;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:16 2018/3/20.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        boolean check = x < 0 || (x != 0 && x % 10 ==0);
        if (check){
            return false;
        }
        int rev = 0;
        while (x > rev){
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        boolean res = (rev == x) || (x == rev / 10);
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(111));
        System.out.println(solution.isPalindrome(1));
        System.out.println(solution.isPalindrome(0));
        System.out.println(solution.isPalindrome(1221));
        System.out.println(solution.isPalindrome(15221));
        System.out.println(solution.isPalindrome(15222221));
        System.out.println(solution.isPalindrome(-111));
    }
}
