package $169;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 1:51 PM 2/23/19.
 *
 * TODO: https://www.zhihu.com/question/49973163/answer/235921864
 */
public class Solution {
    public int majorityElement(int[] nums){
        int majority = 0, count = 0;
        for (int a : nums){
            if (count == 0){
                majority = a;
                count++;
            }else if (majority == a){
                count++;
            }else {
                count--;
            }
        }
        return majority;
    }
}
