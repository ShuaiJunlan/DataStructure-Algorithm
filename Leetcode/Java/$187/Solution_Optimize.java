package $187;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:26 PM 2/25/19.
 */
public class Solution_Optimize {
    public List<String> findRepeatedDnaSequences(String s){
        if (s == null || s.length() < 11){
            return new ArrayList<>();
        }
        HashSet<String> seen = new HashSet<>(), repeated = new HashSet<>();
        for (int i = 10; i <= s.length(); i++){
            String temp = s.substring(i-10, i);
            if (!seen.add(temp)){
                repeated.add(temp);
            }
        }
        return new ArrayList<>(repeated);
    }
}
