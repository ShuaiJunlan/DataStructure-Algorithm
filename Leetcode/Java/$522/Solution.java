package $522;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:49 2017/4/2.
 */
public class Solution {
    public int findLUSlength(String[] strs) {
        if (strs.length == 0 || strs == null)
            return -1;
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            hashSet.add(strs[i]);
        }
        if (hashSet.size() == 1)
            return -1;
        int maxL = 0;
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String temp = iterator.next();
            maxL = maxL > temp.length() ? maxL : temp.length();
        }
        return maxL;
    }
}
