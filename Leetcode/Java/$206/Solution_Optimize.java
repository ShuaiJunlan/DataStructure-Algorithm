package $206;

import datastruc.ListNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:54 AM 2/26/19.
 */
public class Solution_Optimize {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode tempHead = new ListNode(0), next = head.next;
        tempHead.next = head;
        while (next != null){
            ListNode temp = tempHead.next;
            tempHead.next = next;
            head.next = next.next;
            next.next = temp;
            next = head.next;
        }
        return tempHead.next;
    }
}
