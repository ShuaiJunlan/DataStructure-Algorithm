package $075;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 20:13 2018/6/27.
 */
public class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }
        int red = 0;
        int white = 0;
        int blue = 0;
        for (int i = 0; i < nums.length; i++){
            switch (nums[i]){
                case 0:
                    red++;
                    break;
                case 1:
                    white++;
                    break;
                case 2:
                    blue++;
                    break;
                default:
                    break;
            }
        }
        int j = 0;
        for (; j < red; j++){
            nums[j] = 0;
        }
        for (; j < red + white; j++){
            nums[j] = 1;
        }
        for (; j < nums.length; j++){
            nums[j] = 2;
        }
    }
}
