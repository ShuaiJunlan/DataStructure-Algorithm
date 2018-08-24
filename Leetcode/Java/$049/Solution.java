package $049;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:00 2017/10/24.
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists= new LinkedList<>();
        if(strs == null || strs.length == 0) {
            return lists;
        }
        int length = strs.length;
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char str[] = strs[i].toCharArray();
            Arrays.sort(str);
            if (map.containsKey(String.valueOf(str))) {
                map.get(String.valueOf(str)).add(strs[i]);
            } else {
                LinkedList<String> list = new LinkedList<>();
                list.add(strs[i]);
                map.put(String.valueOf(str), list);
            }
        }
        for (List<String> a : map.values()){
            lists.add(a);
        }
        return lists;
    }

    public static void main(String[] args) {
        String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution solution = new Solution();
        solution.groupAnagrams(strs);
    }
}
