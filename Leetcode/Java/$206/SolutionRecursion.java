package $206;

import datastruc.ListNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:22 PM 8/26/19.
 */
public class SolutionRecursion {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        return recursion(head, null);
    }
    private ListNode recursion(ListNode head, ListNode newHead){
        if (head == null){
            return newHead;
        }
        ListNode next = head.next;
        head.next = newHead;
        return recursion(next, head);
    }
}
