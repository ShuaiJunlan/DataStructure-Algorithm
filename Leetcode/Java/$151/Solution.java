package $151;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:13 PM 2/18/19.
 */
public class Solution {
    public String reverseWords(String s){
        if (s == null || s.length() == 0){
            return "";
        }
        String[] strs = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = strs.length-1; i >= 0; i--){
            if (strs[i].length() > 0){
                if (stringBuilder.length() > 0){
                    stringBuilder.append(" ");
                }
                stringBuilder.append(strs[i]);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("  the sky is blue   "));
    }
}
