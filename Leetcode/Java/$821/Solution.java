package $821;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:30 2018/4/22.
 */
public class Solution {
    public int[] shortestToChar(String S, char C) {
        if (S == null || S.length() == 0){
            return null;
        }
        int[] re = new int[S.length()];
        for (int i = 0; i < S.length(); i++){
            re[i] = Integer.MAX_VALUE;
            for (int  j = 0; j < S.length(); j++){
                if (S.charAt(j) == C){
                    re[i] = re[i] < Math.abs(j-i) ? re[i] : Math.abs(j-i);
                }
            }
        }
        return re;
    }
}
