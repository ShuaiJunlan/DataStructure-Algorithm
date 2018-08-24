package $107;

import datastruc.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 2:55 PM 2018/08/16.
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        LinkedList<List<Integer>> lists = new LinkedList<>();
        if (root == null){
            return lists;
        }
        List list = new ArrayList();
        list.add(root);
        bfs(lists, list);
        return lists;
    }
    private void bfs(LinkedList<List<Integer>> lists, List<TreeNode> list){
        if (list.size() == 0){
            return;
        }
        List<Integer> store = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++){
            TreeNode temp = list.remove(0);
            store.add(temp.val);
            if (null != temp.left){
                list.add(temp.left);
            }
            if (null != temp.right){
                list.add(temp.right);
            }
        }
        lists.addFirst(store);
        bfs(lists, list);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        solution.levelOrderBottom(root);
    }
}
