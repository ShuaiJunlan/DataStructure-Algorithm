package $020;

import java.util.LinkedList;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 21:47 2018/5/11.
 */
public class Solution {
    public boolean isValid(String s) {
        if (s == null){
            return false;
        }
        if (s.length() == 0){
            return true;
        }
        LinkedList<Character> characters = new LinkedList<>();
        for (Character c : s.toCharArray()){
            switch (c){
                case '(':
                case '[':
                case '{':
                    characters.push(c);
                    break;
                case ')':
                    if (characters.isEmpty() || characters.pop() != '('){
                        return false;
                    }
                    break;
                case ']':
                    if (characters.isEmpty() || characters.pop() != '['){
                        return false;
                    }
                    break;
                case '}':
                    if (characters.isEmpty() || characters.pop() != '{'){
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        if (characters.size() != 0){
            return false;
        }
        return true;
    }
}
