package $127;

import java.util.*;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:37 2018/10/7.
 */
public class Solution_Wrong {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        wordSet.add(endWord);
        Queue<String> queue = new LinkedList<String>();
        queue.add(beginWord);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.remove();
                if (cur.equals(endWord)) {
                    return level + 1;
                }
                for (int j = 0; j < cur.length(); j++) {
                    char[] word = cur.toCharArray();
                    for (char ch = 'a'; ch < 'z'; ch++) {
                        word[j] = ch;
                        String check = new String(word);
                        if (!check.equals(cur) && wordSet.contains(check)) {
                            queue.add(check);
                            wordSet.remove(check);
                        }
                    }
                }
            }
            level++;
        }
        return 0;

    }
}
