package $228;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:41 AM 4/9/19.
 */
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0){
            return new ArrayList<>();
        }
        List<String> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j <= nums.length; j++){
                if (j == nums.length || nums[j]-nums[j-1] != 1){
                    if (j - i == 1){
                        list.add(String.valueOf(nums[i]));
                    }else {
                        list.add(nums[i] + "->" + nums[j - 1]);
                    }
                    i = j-1;
                    break;
                }
            }
        }
        return list;
    }
}
