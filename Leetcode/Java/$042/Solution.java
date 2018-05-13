package $042;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 13:36 2018/5/13.
 */
public class Solution {
    public int trap(int[] height){
        if (height == null || height.length < 3){
            return 0;
        }
        int leftHeight = height[0];
        int rightHeight = height[height.length-1];

        int left = 1;
        int right = height.length - 2;

        int result = 0;
        while (left <= right){
            if (leftHeight <= rightHeight){
                result += Math.max(leftHeight - height[left], 0);
                leftHeight = Math.max(leftHeight, height[left]);
                left++;
            }else {
                result += Math.max(rightHeight - height[right], 0);
                rightHeight = Math.max(rightHeight, height[right]);
                right--;
            }
        }
        return result;
    }
}
