package $006;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:35 2018/3/26.
 */
public class Solution {
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows == 1){
            return s;
        }
        StringBuffer[]  lists = new  StringBuffer[numRows];
        for (int i = 0; i < numRows; i++){
            lists[i] = new StringBuffer();
        }
        boolean flag = true;
        int j = 1;
        for (; (j + numRows - 1) <= s.length();){
            if (flag){
                for (int i = 0; i < numRows - 1; i++){
                    lists[i].append(s.charAt(j-1+i));
                }
                flag = false;
            }else {
                for (int i = 0; i < numRows - 1; i++){
                    lists[numRows-1-i].append(s.charAt(j-1+i));
                }
                flag = true;
            }
            j+= (numRows-1);
        }
//        j -= (numRows-1);
        if (flag){
            for (int i = 0; j+i <= s.length(); i++){
                lists[i].append(s.charAt(j-1+i));
            }
        }else {
            for (int i = 0; j+i <= s.length(); i++){
                lists[numRows-1-i].append(s.charAt(j-1+i));
            }
        }
        StringBuffer re = new StringBuffer();
        for (int i = 0; i < numRows; i++){
            re.append(lists[i].toString());
        }
        return re.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convert("PAYPALISHIRING", 3));
    }
}
