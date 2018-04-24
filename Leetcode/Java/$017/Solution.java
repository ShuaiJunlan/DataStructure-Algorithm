package $017;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:42 2018/4/24.
 */
public class Solution {
    private static char[][] letters = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
    public List<String> letterCombinations(String digits){
        if (digits == null || digits.length() == 0){
            return new LinkedList<>();
        }
        LinkedList<String> list = new LinkedList<>();
        int num = Character.getNumericValue(digits.charAt(0));
        for (int i = 0; i < letters[num].length; i++){
            list.add(String.valueOf(letters[num][i]));
        }
        for (int m = 1; m < digits.length(); m++){
            while (list.peek() != null && list.peek().length() == m){
                String string = list.poll();
                num = Character.getNumericValue(digits.charAt(m));
                for (int k = 0; k < letters[num].length; k++){
                    list.add(string + letters[num][k]);
                }
            }
        }
        return list;
    }
}