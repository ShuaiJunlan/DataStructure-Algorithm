package $126;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 6:21 PM 2/27/19.
 */
public class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> beginSet = new HashSet<>(), endSet = new HashSet<>(), visited = new HashSet<>(), wordSet = new HashSet<>(wordList);
        List<List<String>> re = new ArrayList<>();
        if (!wordSet.contains(wordList)){
            return re;
        }
        beginSet.add(beginWord);
        endSet.add(endWord);
        int len = 1, strLen = beginWord.length(), minLen = Integer.MAX_VALUE;
        while (!beginSet.isEmpty() && !endSet.isEmpty() && len < minLen){
            if (beginSet.size() > endSet.size()){
                Set<String> temp = beginSet;
                beginSet = endSet;
                endSet = temp;
            }
            Set<String> tempSet = new HashSet<>();

            for (String s : beginSet){
                char[] chars = s.toCharArray();
                for (int i = 0; i < strLen; i++){
                    char oldChar = chars[i];
                    for (char j = 'a'; j <= 'z'; j++){
                        chars[i] = j;
                        String temp = new String(chars);
                        if (endSet.contains(temp)){
                            len += 1;
                            if (len <= minLen){

                            }
                        }
                            minLen = Math.min(len, Integer.MAX_VALUE);
                        if (wordSet.contains(temp) && visited.add(temp)){
                            tempSet.add(temp);
                        }
                    }
                    chars[i] = oldChar;
                }
            }
            beginSet = tempSet;
            len++;

        }
        return re;
    }
}
