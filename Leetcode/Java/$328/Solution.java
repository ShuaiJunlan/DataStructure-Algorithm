package $328;

import datastruc.ListNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:15 PM 11/4/19.
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head != null) {
            ListNode odd = head, even = head.next, evenHead = even;
            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }
}
