package $055;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 8:44 PM 2018/07/18.
 *
 * TLE
 */
public class SolutionTLE {
    public boolean value;
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0){
            return true;
        }
        bfs(nums, 0);
        return value;
    }
    void bfs(int[] nums, int index){
        if (value || index == nums.length-1){
            value = true;
            return;
        }
        for (int i = nums[index]; i > 0; i--){
            bfs(nums, index + i);
        }
    }
}
