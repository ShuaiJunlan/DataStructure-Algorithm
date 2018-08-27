package $109;

import datastruc.ListNode;
import datastruc.TreeNode;
import sun.reflect.generics.tree.Tree;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 17:31 2018/8/27.
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head){
        if (head == null){
            return null;
        }
        return toBST(head, null);
    }
    public TreeNode toBST(ListNode head, ListNode tail){
        ListNode slow = head;
        ListNode fast = head;
        if (head == tail){
            return null;
        }
        while (fast != tail && fast.next != tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode temHead = new TreeNode(slow.val);
        temHead.left = toBST(head, slow);
        temHead.right = toBST(slow.next, tail);
        return temHead;
    }
}
