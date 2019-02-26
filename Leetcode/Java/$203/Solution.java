package $203;

import datastruc.ListNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:28 AM 2/26/19.
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return null;
        }
        ListNode tempHead = new ListNode(0);
        tempHead.next = head;
        ListNode pre = tempHead;
        while (head != null){
            if (head.val == val){
                pre.next = head.next;
            }else {
                pre = pre.next;
            }
            head = head.next;
        }
        return tempHead.next;
    }
}
