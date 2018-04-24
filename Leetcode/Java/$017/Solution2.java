package $017;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:44 2018/4/24.
 *
 * running with recursion
 */
public class Solution2 {
    private static final char[][] LETTERS = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
    private static List<String> res = new LinkedList<>();

    public List<String> letterCombinations(String digits) {
        //must clear the res, because of the static res affected by the last result;
        res.clear();

        if (digits == null || digits.length() == 0){
            return res;
        }
        doRecursion(digits, 0, "");
        return res;
    }
    private void doRecursion(String digits, int index, String s){
        if(index == digits.length()){
            res.add(s);
            return;
        }
        int num = Character.getNumericValue(digits.charAt(index));
        for (int i = 0; i < LETTERS[num].length; i++){
            doRecursion(digits, index+1, s + LETTERS[num][i]);
        }
    }
}
