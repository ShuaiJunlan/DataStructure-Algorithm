package $173;

import datastruc.TreeNode;

import java.util.Stack;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 4:29 PM 2/24/19.
 */
public class BSTIteratorWithStack {
    private Stack<TreeNode> stack;
    public BSTIteratorWithStack(TreeNode root){
        stack = new Stack<>();
        TreeNode cur = root;
        while (cur  != null){
            stack.push(cur);
            cur = cur.left;
        }
    }
    public boolean hasNext(){
        return !stack.isEmpty();
    }
    public int next(){
        TreeNode node = stack.pop(), cur = node;
        if (cur.right != null){
            cur = cur.right;
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }

        }
        return node.val;
    }
}
