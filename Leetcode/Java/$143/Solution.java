package $143;

import datastruc.ListNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:04 AM 2018/10/01.
 */
public class Solution {
    public void reorderList(ListNode head){
        if (head == null || head.next == null){
            return;
        }
        ListNode middle = head, fast = head;
        while (fast.next != null && fast.next.next != null){
            middle = middle.next;
            fast = fast.next.next;
        }

        ListNode preMiddle = middle, preCurrent = middle.next;
        while (preCurrent != null){
            ListNode temp = preCurrent.next;
            preMiddle.next = temp;
            preCurrent.next = temp.next;
            temp.next = preCurrent;
        }

        middle = head;
        fast = preMiddle.next;
        while (middle != preMiddle){
            preMiddle.next = fast.next;
            fast.next = middle.next;
            middle.next = fast;
            middle = fast.next;
            fast = preMiddle.next;
        }
    }
}
