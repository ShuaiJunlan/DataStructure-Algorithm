package $336;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:24 PM 2/26/19.
 */
public class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> re = new ArrayList<>();
        bfs(re, words, -1, 0, new int[2]);
        return re;
    }
    private void bfs(List<List<Integer>> re, String[] words, int i, int t, int[] indexes){
        if (t == 2){
            if (isPalindrome(words, indexes)){
                List<Integer> list = new ArrayList<>(indexes.length);
                list.add(indexes[0]);
                list.add(indexes[1]);
                re.add(list);
            }
            return;
        }
        for (int j = 0; j < words.length; j++){
            if (i == j){
                continue;
            }
            indexes[t] = j;
            bfs(re, words, j, t+1, indexes);
        }
    }
    private boolean isPalindrome(String[] words, int[] indexes){
        String a = words[indexes[0]] + words[indexes[1]];
        int i = 0, j = a.length() - 1;
        while (i <= j){
            if (a.charAt(i++) != a.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
