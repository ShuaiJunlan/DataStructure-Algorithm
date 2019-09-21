package $551;

import java.util.Objects;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:25 PM 9/9/19.
 */
public class SolutionNew {
    public boolean checkRecord(String s) {
        if (Objects.isNull(s) || s.isEmpty()) {
            return false;
        }
        int countA = 0, continuousL = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                countA++;
                continuousL = 0;
            } else if (s.charAt(i) == 'L') {
                continuousL++;
            } else {
                continuousL = 0;
            }
            if (countA > 1 || continuousL > 2) {
                return false;
            }
        }
        return true;

    }
}
