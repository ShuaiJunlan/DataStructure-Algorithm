package $116;

import datastruc.TreeLinkNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:27 AM 2018/09/17.
 */
public class Solution_RECURSIVE {
    public void connecct(TreeLinkNode root){
        if (root != null){
            if (root.left != null){
                root.left.next = root.right;
            }
            if (root.right != null && root.next != null){
                root.right.next = root.next.left;
            }
            connecct(root.left);
            connecct(root.right);
        }

    }
}
