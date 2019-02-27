package $127;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:12 2018/10/7.
 */
public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordDict){
        Set<String> beginSet = new HashSet<>(), endSet = new HashSet<>(), wordSet = new HashSet<>(wordDict), visited = new HashSet<>();
        if (!wordDict.contains(endWord)){
            return 0;
        }
        int len = 1, strLen = beginWord.length();
        beginSet.add(beginWord);
        endSet.add(endWord);
        while (!beginSet.isEmpty() && !endSet.isEmpty()){
            if (beginSet.size() > endSet.size()){
                Set<String> temp = beginSet;
                beginSet = endSet;
                endSet = temp;
            }
            Set<String> tempSet = new HashSet<>();
            for (String s : beginSet){
                char[] chars = s.toCharArray();
                for (int i = 0; i < strLen; i++){
                    char old = chars[i];
                    for (char j = 'a'; j <= 'z'; j++){
                        chars[i] = j;
                        String temp = new String(chars);
                        if (endSet.contains(temp)){
                            return len+1;
                        }
                        if (visited.add(temp) && wordSet.contains(temp)){
                            tempSet.add(temp);
                        }
                    }
                    chars[i] = old;
                }
            }
            beginSet = tempSet;
            len++;
        }
        return 0;
    }
}
