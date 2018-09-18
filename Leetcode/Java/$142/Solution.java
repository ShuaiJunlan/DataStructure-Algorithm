package $142;

import datastruc.ListNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:38 AM 2018/09/18.
 */
public class Solution {
    public ListNode detectCycle(ListNode head){
        if (head == null || head.next == null){
            return null;
        }
        //if fast = head.next.next, slow = head.next, then  it mate be dead loop when tail node connects to head.
        ListNode fast = head.next.next, slow = head.next;
        while (fast != null && fast.next != null){
            if (fast == slow){
                ListNode temp = head;
                while (temp != slow){
                    temp = temp.next;
                    slow = slow.next;
                }
                return temp;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return null;
    }
}
