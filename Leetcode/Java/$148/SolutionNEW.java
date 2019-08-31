package $148;

import datastruc.ListNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 2:54 PM 8/26/19.
 */
public class SolutionNEW {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode fast = head, slow = head, temp = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            temp = slow;
            slow = slow.next;
        }
        temp.next = null; //cut into two lists
        ListNode node1 = sortList(head);
        ListNode node2 = sortList(slow);
        return merge(node1, node2);
    }
    private ListNode merge(ListNode node1, ListNode node2){
        if (node1 == null){
            return node2;
        }
        if (node2 == null){
            return node1;
        }
        if (node1.val < node2.val){
            node1.next = merge(node1.next, node2);
            return node1;
        }else {
            node2.next = merge(node1, node2.next);
            return node2;
        }
    }
}
