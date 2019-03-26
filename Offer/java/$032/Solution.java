package $032;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 11:30 AM 3/26/19.
 */
public class Solution {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }

        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);

        ArrayList<Integer> re = new ArrayList<>();
        while (!linkedList.isEmpty()){
            TreeNode temp = linkedList.pop();
            re.add(temp.val);
            if (temp.left != null){
                linkedList.add(temp.left);
            }
            if (temp.right != null){
                linkedList.add(temp.right);
            }
        }
        return re;
    }

}
