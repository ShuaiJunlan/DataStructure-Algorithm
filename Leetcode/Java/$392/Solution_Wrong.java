package $392;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 11:12 AM 2/28/19.
 */
public class Solution_Wrong {
    private class Node{

        Node(int minIndex, int maxIndex, int count){
            this.minIndex = minIndex;
            this.maxIndex = maxIndex;
            this.count = count;
        }
        int count;
        int minIndex;
        int maxIndex;
        byte flag = 0x02;
    }
    public boolean isSubsequence(String s, String t) {
        Map<Character, Node> characterNodeMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++){
            Node node;
            if ((node = characterNodeMap.get(t.charAt(i))) == null){
                characterNodeMap.put(t.charAt(i), new Node(i, i, 1));
            }else {
                node.maxIndex = Math.max(i, node.maxIndex);
                node.minIndex = Math.min(i, node.minIndex);
                node.count += 1;
                // characterNodeMap.put(t.charAt(i), node);
            }
        }
        Node pre = null;
        for (int j = 0; j < s.length(); j++){
            if (!characterNodeMap.containsKey(s.charAt(j))){
                return false;
            }
            if (j == 0){
                pre = characterNodeMap.get(s.charAt(j));
            }else {
                Node temp = characterNodeMap.get(s.charAt(j));
                if (temp == pre){
                    if (temp.count <= 0){
                        return false;
                    }else {
                        temp.count--;
                    }
                }
                if (temp.maxIndex < getMax(pre)){
                    return false;
                }
                //????
                // if (temp.maxIndex == getMax(pre)){
                //     if (temp.count > 0){
                //         temp.count--;
                //         pre = temp;
                //         continue;
                //     }else {
                //         return false;
                //     }
                // }
                if (temp.minIndex > getMax(pre)){
                    pre = temp;
                }else {
                    temp.flag ^= 0x03;
                    pre = temp;
                }
            }
        }
        return true;
    }
    private int getMax(Node node){
        if ((node.flag & 0x02) == 2){
            return node.maxIndex;
        }
        if ((node.flag & 0x01) == 1){
            return node.minIndex;
        }
        return Integer.MAX_VALUE;
    }
}
