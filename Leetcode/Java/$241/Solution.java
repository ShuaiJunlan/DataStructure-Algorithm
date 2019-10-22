package $241;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:30 AM 10/22/19.
 */
public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> ret = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*') {
                String part1 = input.substring(0, i), part2 = input.substring(i + 1);
                List<Integer> part1Ret = diffWaysToCompute(part1), part2Ret = diffWaysToCompute(part2);
                for (Integer p1 : part1Ret) {
                    for (Integer p2 : part2Ret) {
                        int c = 0;
                        switch (input.charAt(i)) {
                            case '+':{
                                c = p1 + p2;
                                break;
                            }
                            case '-':
                                c = p1 - p2;
                                break;
                            case '*':
                                c = p1 * p2;
                                break;
                            default:
                                break;
                        }
                        ret.add(c);
                    }
                }
            }
        }
        if (ret.size() == 0) {
            ret.add(Integer.valueOf(input));
        }
        return ret;
    }
}
