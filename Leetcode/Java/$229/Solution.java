package $229;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 2:58 PM 4/15/19.
 */
public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        int a = nums[0], b = nums[0];
        int countA = 0, countB = 0;
        for (int n : nums) {
            if (n == a) {
                countA++;
                continue;
            }
            if (n == b) {
                countB++;
                continue;
            }
            if (countA == 0) {
                a = n;
                countA++;
                continue;
            }
            if (countB == 0) {
                b = n;
                countB++;
                continue;
            }
            countA--;
            countB--;
        }

        countA = countB = 0;

        for (int n : nums) {
            if (n == a) {
                countA++;
            } else if (n == b) {
                countB++;
            }
        }
        List<Integer> list = new ArrayList<>();
        if (countA > nums.length / 3) {
            list.add(a);
        }
        if (countB > nums.length / 3) {
            list.add(b);
        }
        return list;
    }
}
