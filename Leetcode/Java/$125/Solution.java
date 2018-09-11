package $125;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 3:11 PM 2018/09/11.
 */
public class Solution {
    public boolean isPalindrome(String s){
        if (s == null || s.length() == 0){
            return true;
        }
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left <= right){
            if (left == right){
                return true;
            }
            while ((chars[left] < 48 || chars[left] > 122 || (chars[left] > 57 && chars[left] < 97)) && left < right){
                left++;
            }
            while ((chars[right] < 48 || chars[right] > 122 || (chars[right] > 57 && chars[right] < 97)) && left < right){
                right--;
            }
            if (chars[left] != chars[right]){
                return false;
            }else {
                left++;
                right--;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "Nella's simple hymn: \"I attain my help, Miss Allen.\"";
        solution.isPalindrome(str);
    }
}
