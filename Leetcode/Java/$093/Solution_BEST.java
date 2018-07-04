package $093;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 7:56 PM 2018/07/04.
 */
class Solution_BEST {

    public List<String> restoreIpAddresses(String s) {
        if (s.length() < 4 || s.length() > 12) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        char[] temp = new char[s.length() + 3];
        dfs(result, s, temp, 0, 0);
        return result;
    }

    private void dfs(List<String> result, String s, char[] temp, int stringIndex, int elementIndex) {
        if (elementIndex == 4) {
            if (stringIndex == s.length()) {
                result.add(String.valueOf(temp));
            }
            return;
        }
        int number = 0;
        for (int i = stringIndex;i < s.length() && i < stringIndex + 3;i++) {
            if (s.charAt(stringIndex) == '0' && i != stringIndex) {
                break;
            }
            number = number * 10 + s.charAt(i) - '0';
            if (number > 255) {
                break;
            }
            temp[i + elementIndex] = s.charAt(i);
            if (elementIndex != 3) {
                temp[i + elementIndex + 1] = '.';
            }
            dfs(result, s, temp, i + 1, elementIndex + 1);
        }
    }

}
