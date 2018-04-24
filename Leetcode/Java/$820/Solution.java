package $820;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 11:38 2018/4/22.
 */
public class Solution {
    public int minimumLengthEncoding(String[] words) {
        if (words == null || words.length == 0){
            return 0;
        }
        Set<String> strings = new HashSet<>(Arrays.asList(words));
        for (int i = 0; i < words.length; i++){
            for (int j = 1; j < words[i].length(); j++){
                strings.remove(words[i].substring(j));
            }
        }
        int ans = 0;
        for (String str : strings){
            ans += (str.length() + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] arr = {"11","12"};
        Set<String> stringSet = new HashSet<>(Arrays.asList(arr));
        System.out.println(stringSet.size());
    }
}
