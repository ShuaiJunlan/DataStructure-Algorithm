package $143;

import datastruc.ListNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:24 PM 3/1/19.
 */
public class Solution {
    public void reorderList(ListNode head){
        if (head == null || head.next == null){
            return;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }

        ListNode preMiddle = p1;
        ListNode preCurrent = p1.next;
        while (preCurrent != null && preCurrent.next != null){
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            current.next = preMiddle.next;
            preMiddle.next = current;
        }

        p1 = head;
        p2 = preMiddle.next;
        while (p1 != preMiddle){
            preMiddle.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = preMiddle.next;
        }
    }
}
