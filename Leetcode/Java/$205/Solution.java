package $205;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:43 AM 2/26/19.
 */
public class Solution {
    public boolean isIsomorphic(String s, String t){
        if (s == null && t == null){
            return true;
        }
        int[] num1 = new int[256], num2 = new int[256];
        int length = s.length();
        for (int i = 0; i < length; i++){
            if (num1[s.charAt(i)] != num2[t.charAt(i)]){
                return false;
            }
            num1[s.charAt(i)] = i + 1;
            num2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
