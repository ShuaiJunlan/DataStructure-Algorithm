package $132;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:29 AM 2018/09/30.
 */
public class Solution {
    public int minCut(String s){
        int length = s.length();
        int[] cut = new int[length+1];
        for (int i = 0; i <= length; i++){
            cut[i] = i - 1;
        }
        for (int i = 0; i <= length; i++){
            for (int j = 0; i - j >= 0 && i + j < length && s.charAt(i-j) == s.charAt(i+j); j++){
                cut[i+j+1] = Math.min(cut[i+j+1], 1 + cut[i-j]);
            }
            for (int j = 1; i-j+1 >= 0 && i+j < length && s.charAt(i-j+1) == s.charAt(i+j); j++){
                cut[i+j+1] = Math.min(cut[i+j+1], 1+cut[i-j+1]);
            }
        }
        return cut[length];
    }
}
