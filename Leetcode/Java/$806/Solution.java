package $806;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 12:54 2018/3/25.
 */
public class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int lines = 0;
        int sum = 0;
        int[] re = new int[2];
        for (int i = 0; i < S.length(); i++){
            sum = sum + widths[S.charAt(i) - 'a'];
            if (sum > 100){
                lines++;
                sum = 0;
                i--;
            }
        }
        re[0] = ++lines;
        re[1] = sum;
        return  re;
    }
}
