package $028;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 20:26 2017/11/5.
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null){
            return -1;
        }
        for (int i = 0; ; i++){
            for (int j = 0; ; j++){
                if (j == needle.length()){
                    return i;
                }
                if (i+j >= haystack.length()){
                    return -1;
                }
                if (needle.charAt(j) != haystack.charAt(i+j)){
                    break;
                }
            }
        }
    }
}
