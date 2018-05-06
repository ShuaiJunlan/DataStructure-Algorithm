package $019;

import datastruc.ListNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 12:47 2018/5/6.
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null){
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null && n > 0){
            fast = fast.next;
            n--;
        }
        //when the deleted node is the head
        if (fast == null && n == 0){
            head = head.next;
            return head;
        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
