package $199;

import datastruc.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:09 PM 2/25/19.
 */
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null){
            return list;
        }

        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);

        while (!linkedList.isEmpty()){
            TreeNode treeNode = linkedList.getLast();
            list.add(treeNode.val);

            LinkedList<TreeNode> temp = new LinkedList<>();
            while (!linkedList.isEmpty()){
                treeNode = linkedList.poll();
                if (treeNode.left != null){
                    temp.add(treeNode.left);
                }
                if (treeNode.right != null){
                    temp.add(treeNode.right);
                }
            }
            linkedList = temp;

        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        Solution solution = new Solution();
        solution.rightSideView(root);
    }
}
