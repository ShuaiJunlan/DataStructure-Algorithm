package $131;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:05 AM 2018/09/28.
 */
public class Solution_DFS {
    public List<List<String>> partition(String s){
        List<List<String>> resultList = new ArrayList<>();
        List<String> result = new ArrayList<>();
        dfs(resultList, result, s, 0);
        return resultList;
    }
    private void dfs(List<List<String>> resultSet, List<String> result, String s, int st){
        if (st == s.length()){
            resultSet.add(new ArrayList<>(result));
            return;
        }
        for (int i = st + 1; i <= s.length(); i++){
            if (!isPalindrome(s, st, i - 1)){
                continue;
            }
            result.add(s.substring(st, i));
            dfs(resultSet, result, s, i);
            result.remove(result.size() - 1);
        }
    }
    private boolean isPalindrome(String s, int i, int j){
        if (i == j){
            return true;
        }
        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
