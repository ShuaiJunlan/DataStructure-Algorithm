package $018_what;

import datastruc.TreeNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:36 2018/8/24.
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums){
        if (nums == null || nums.length  == 0){
            return null;
        }
        return helper(nums, 0, nums.length-1);
    }

    private TreeNode helper(int[] nums, int low, int high) {
        if (low > high){
            return null;
        }
        int mid = (low + high) >> 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, low, mid - 1);
        node.right = helper(nums, mid + 1, high);
        return node;
    }
}
