package $173;

import datastruc.TreeNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:15 PM 2/24/19.
 */
public class BSTIterator {
    private TreeNode root;
    public BSTIterator(TreeNode root) {
        this.root = root;
    }

    /** @return the next smallest number */
    public int next() {
        if (root.left == null && root.right == null){
            int val = root.val;
            root = null;
            return val;
        }
        if (root.left == null){
            int val = root.val;
            root = root.right;
            return val;
        }
        return getAndRemoveSmallestNode(root.left, root);
    }
    public int getAndRemoveSmallestNode(TreeNode root, TreeNode parent){
        if (root.left != null){
            return getAndRemoveSmallestNode(root.left, root);
        }else {
            int val = root.val;
            parent.left = root.right;
            return val;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return root != null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        // root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        BSTIterator bstIterator = new BSTIterator(root);
        // System.out.println(bstIterator.next());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());
    }
}
