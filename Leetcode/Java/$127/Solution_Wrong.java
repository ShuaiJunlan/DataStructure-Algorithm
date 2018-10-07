package $127;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:37 2018/10/7.
 */
public class Solution_Wrong {
    public int ladderLength(String beginWord, String endWord, List<String> wordList){
        Set<String> beginSet = new HashSet<>(), endSet = new HashSet<>();
        int len = 1;
        Set<String> visited = new HashSet<>();
        beginSet.add(beginWord);
        endSet.add(endWord);
        while (!beginSet.isEmpty() && !endSet.isEmpty()){
            if (beginSet.size() > endSet.size()){
                Set<String> temp = beginSet;
                beginSet = endSet;
                endSet = temp;
            }
            Set<String> temp = new HashSet<>();
            for (String word : beginSet){
                char[] chs = word.toCharArray();
                for (int i = 0; i < chs.length; i++){
                    for (char c = 'a'; c <= 'z'; c++){
                        char old = chs[i];
                        chs[i] = c;
                        String target = String.valueOf(chs);
                        if (endSet.contains(target)){
                            return len + 1;
                        }
                        if (!visited.contains(target) && wordList.contains(target)){
                            temp.add(target);
                            visited.add(target);
                        }
                        chs[i] = old;
                    }
                }
            }
            beginSet = temp;
            len++;
        }
        return 0;
    }
}
