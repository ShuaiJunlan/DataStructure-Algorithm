package $089;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 2:16 PM 2018/07/07.
 */
public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList();
        result.add(0);
        for (int i = 1; i <= n; i++) {
            int size = result.size();
            for (int j = size - 1; j >= 0; j--) {
                result.add(result.get(j) + (1 << (i - 1)));
            }
        }
        return result;
    }

}
