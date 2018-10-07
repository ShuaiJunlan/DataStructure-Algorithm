package $127;

import datastruc.ListNode;

import java.util.*;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:12 2018/10/7.
 */
public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordDict){
        Set<String> reached = new HashSet<>();
        reached.add(beginWord);
        wordDict.add(endWord);
        int distance = 1;
        while (!reached.contains(endWord)){
            Set<String> toAdd = new HashSet<>();
            for (String each : reached){
                for (int i = 0; i < each.length(); i++){
                    char[] chars = each.toCharArray();
                    for (char ch = 'a'; ch <= 'z'; ch++){
                        chars[i] = ch;
                        String word = String.valueOf(chars);
                        if (wordDict.contains(word)){
                            toAdd.add(word);
                            wordDict.remove(word);
                        }
                    }
                }
            }
            distance++;
            if (toAdd.size() == 0){
                return 0;
            }
            reached = toAdd;
        }
        return distance;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String words[] = {"hot","dot","dog","lot","log"};
        System.out.println(solution.ladderLength("hit", "cog",new ArrayList<String>().add(words)));
    }
}
