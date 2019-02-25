package $187;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:09 PM 2/25/19.
 */
public class Solution {
    public List<String> findRepeatedDnaSequences(String a){
        if (a == null || a.length() <= 10){
            return new LinkedList<>();
        }
        List<String> re = new LinkedList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 10; i <= a.length(); i++){
            String temp = a.substring(i-10, i);
            Integer value = hashMap.get(temp);
            if (value == null){
                hashMap.put(temp, 1);
            }else if (value == 1){
                re.add(temp);
                hashMap.put(temp, value+1);
            }else {
                hashMap.put(temp, value+1);
            }
        }
        return re;
    }
}
