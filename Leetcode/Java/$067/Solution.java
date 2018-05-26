package $067;

import java.util.LinkedList;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:59 2018/5/26.
 */
public class Solution {
    public String addBinary(String a, String b) {
        int count = a.length() > b.length() ? a.length() : b.length();
        LinkedList<Character> linkedList = new LinkedList<>();
        int temp = 0, bita = 0, bitb = 0;
        for (int i = 0; i < count; i++) {
            if (i < a.length()){
                bita = a.charAt(a.length() - i - 1) - '0';
            }
            if (i < b.length()){
                bitb = b.charAt(b.length() - i - 1) - '0';
            }
            linkedList.addFirst((char)(bita^bitb^temp  + '0'));
            temp = (temp + bita + bitb) / 2;
            bita = 0;
            bitb = 0;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (temp == 1){
            stringBuffer.append("1");
        }
        for (Character c : linkedList){
            stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("111", "0"));
    }
}
