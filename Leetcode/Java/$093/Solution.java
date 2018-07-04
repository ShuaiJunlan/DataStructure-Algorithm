package $093;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 7:12 PM 2018/07/04.
 */
public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= s.length(); i++){
            bfs(list, new StringBuffer().append(s, 0, i), 0, i, 1, s);
        }
        return list;

    }
    public void bfs(List<String> list, StringBuffer ip, int begin, int index, int steps, String s){
        Boolean temp = (index - begin > 1 && s.charAt(begin) == '0') || index - begin > 3 || Integer.valueOf(s.substring(begin, index)) > 255;
        if (temp){
            return;
        }
        if(steps == 4){
            if (index == s.length()){
                list.add(ip.toString());
            }
            return;
        }
        for (int i = index + 1; i <= s.length(); i++){
            bfs(list, new StringBuffer(ip).append(".").append(s, index, i), index, i, steps+1, s);
        }

    }

}
