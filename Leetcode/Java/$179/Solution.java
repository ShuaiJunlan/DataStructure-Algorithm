package $179;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:03 PM 2/25/19.
 */
public class Solution {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        String[] numStr = new String[nums.length];
        int i = 0;
        for (int n : nums) {
            numStr[i++] = String.valueOf(n);
        }
        Arrays.sort(numStr, new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s2.compareTo(s1);
            }
        });
        // An extreme edge case by lc, say you have only a bunch of 0 in your int array
        if(numStr[0].charAt(0) == '0'){
            return "0";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (String str : numStr){
            stringBuilder.append(str);
        }

        return stringBuilder.toString();
    }
}
