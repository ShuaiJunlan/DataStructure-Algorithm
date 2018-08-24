package $091;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:19 AM 2018/07/31.
 */
public class Solution {
    public int numDecodings(String s) {
        int length = s.length();
        if (length == 0){
            return 0;
        }
        int[] num = new int[length + 1];
        num[length] = 1;
        num[length - 1] = s.charAt(length-1) != '0' ? 1 : 0;
        for (int i = length - 2; i >= 0; i--){
            if (s.charAt(i) == '0'){
                continue;
            }else {
                num[i] = (Integer.parseInt(s.substring(i, i+2)) <= 26) ? num[i+1] + num[i+2] : num[i+1];
            }
        }
        return num[0];
    }
}
