package $116;

import datastruc.TreeLinkNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:15 AM 2018/09/17.
 */
public class Solution {
    public void connect(TreeLinkNode root){
        TreeLinkNode start = root;
        while (start != null){
            TreeLinkNode cur = start;
            while (cur != null){
                if (cur.left != null){
                    cur.left.next = cur.right;
                }
                if (cur.right != null && cur.next != null){
                    cur.right.next = cur.next.left;
                }
                cur = cur.next;
            }
            start = start.left;
        }
    }
}
