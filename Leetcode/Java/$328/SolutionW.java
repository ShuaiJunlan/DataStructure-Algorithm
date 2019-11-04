package $328;

import datastruc.ListNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:56 PM 11/4/19.
 */
public class SolutionW {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null){
            return head;
        }
        ListNode tempHead1 = head, tempHead2 = head.next, temp = head.next.next;
        while (temp != null){
            appendNode(tempHead1, temp);
            appendNode(tempHead2, temp.next);
            tempHead1 = tempHead1.next;
            tempHead2 = tempHead2.next;
            temp = temp.next == null ? null : temp.next.next;
        }
        return head;
    }
    private void appendNode(ListNode root, ListNode end){
        ListNode temp = root.next;
        root.next = end;
        end.next = temp;
    }
}
