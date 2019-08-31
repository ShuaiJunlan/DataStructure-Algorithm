package $206;

import datastruc.ListNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:12 PM 8/26/19.
 */
public class SolutionNew {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode tmpHead = head, next = head.next;
        while (next != null){
            head.next = next.next;
            next.next = tmpHead;
            tmpHead = next;
            next = head.next;
        }
        return tmpHead;
    }
}
