package $804;

import java.util.HashSet;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 12:55 2018/3/25.
 */
public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hashSet = new HashSet<>();
        if (words == null || words.length == 0){
            return 0;
        }
        for (int i = 0; i < words.length; i++){
            StringBuffer stringBuffer = new StringBuffer();
            if (words[i] == null || words[i].length() == 0){
                continue;
            }
            for (int j = 0; j < words[i].length(); j++){
                stringBuffer.append(code[words[i].charAt(j)-'a']);
            }
            hashSet.add(stringBuffer.toString());
        }
        return hashSet.size();
    }
}
