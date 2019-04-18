package $257;

import datastruc.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:18 PM 4/18/19.
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        List<String> paths = new LinkedList<>();
        helper(root, paths, new StringBuilder().append(root.val));
        return paths;
    }
    public void helper(TreeNode root, List<String> paths, StringBuilder path){
        if (root.left == null && root.right == null){
            paths.add(path.toString());
            return;
        }

        if (root.left != null){
            helper(root.left, paths, new StringBuilder(path).append("->").append(root.left.val));
        }
        if (root.right != null){
            helper(root.right, paths, new StringBuilder(path).append("->").append(root.right.val));
        }
    }
}
