package tree;

import java.util.LinkedList;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:21 PM 3/16/19.
 *
 * https://blog.csdn.net/My_Jobs/article/details/43451187
 */
public abstract class Tree<N extends TreeNode> {
    /**
     * @return
     */
    public abstract TreeNode insert();

    /**
     * @return
     */
    public abstract TreeNode remove();

    /**
     * @param node tree node
     */
    public abstract void preOrder(TreeNode node);

    public void preOrderTraversalRecursion(TreeNode root){
        if (root != null){
            preOrder(root);
            preOrderTraversalRecursion(root.left);
            preOrderTraversalRecursion(root.right);
        }
    }

    /**
     * pre-order without recursion
     * @param root the starting node for this traversal
     */
    public void preOrderTraversal(TreeNode root){
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        TreeNode p = root;
        while (p != null || !linkedList.isEmpty()){
            if (p != null){
                preOrder(p);
                linkedList.push(p);
                p = p.left;
            }else {
                p = linkedList.pop();
                p = p.right;
            }
        }
    }

    public abstract void inOrder(TreeNode node);

    public void inOrderTraversalRecursion(TreeNode root){
        if (root != null){
            inOrderTraversalRecursion(root.left);
            inOrder(root);
            inOrderTraversalRecursion(root.right);
        }
    }

    /**
     * in order without recursion
     * @param root the starting node for this traversal
     */
    public void inOrderTraversal(TreeNode root){
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()){
            if (p != null){
                stack.push(p);
                p = p.left;
            }else {
                p = stack.pop();
                inOrder(p);
                p = p.right;
            }
        }
    }

    public abstract void postOrder(TreeNode node);

    /**
     * post order
     * @param root the starting node for this traversal
     */
    public void postOrderTraversalRecursion(TreeNode root){
        if (root != null){
            postOrderTraversalRecursion(root.left);
            postOrderTraversalRecursion(root.right);
            postOrder(root);
        }
    }

    /**
     * reference https://blog.csdn.net/zhuqiuhui/article/details/51319165
     * @param root the root of the tree
     */
    public void postOrderTraversal(TreeNode root){
        if (root == null){
            return;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode curNode = root, lastVisitNode = null;

        while (curNode != null){
            stack.push(curNode);
            curNode = curNode.left;
        }

        while (!stack.isEmpty()){
            curNode = stack.pop();
            if (curNode.right != null && curNode.right != lastVisitNode){
                stack.push(curNode);
                curNode = curNode.right;
                while (curNode != null){
                    stack.push(curNode);
                    curNode = curNode.left;
                }
            }else {
                postOrder(curNode);
                lastVisitNode = curNode;
            }
        }

    }

    /**
     * doing something for the {@link TreeNode} node
     * @param node the tree node
     */
    public abstract void order(TreeNode node);

    /**
     * level first traversal
     * @param root the starting node for this traversal
     */
    public void levelTraversal(TreeNode root){
        if (root == null){
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode p;
        while (!queue.isEmpty()){
            p = queue.pop();
            order(p);
            if (p.left != null){
                queue.add(p.left);
            }
            if (p.right != null){
                queue.add(p.right);
            }
        }
    }

    /**
     * depth first traversal
     * @param root the starting node for the traversal
     */
    public void depthTraversal(TreeNode root){
        if (root == null){
            return;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        TreeNode p;
        while (!stack.isEmpty()){
            p = stack.pop();
            order(p);
            if (p.left != null){
                stack.push(p.left);
            }
            if (p.right != null){
                stack.push(p.right);
            }
        }
    }
}
