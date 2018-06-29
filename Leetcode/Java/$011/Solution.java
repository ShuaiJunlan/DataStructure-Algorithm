package $011;



/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:43 2018/3/31.
 */
public class Solution {
    public int maxArea(int[] height) {
        if (height == null){
            return 0;
        }
        int left = 0, right = height.length - 1, maxArea = 0;
        while (left < right){
            maxArea = Math.max(maxArea, (right-left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
}
