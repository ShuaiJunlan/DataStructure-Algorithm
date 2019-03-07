package $147;

import datastruc.ListNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:37 PM 3/7/19.
 */
public class Solution_Merge {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        // merge sort
        ListNode slow = head, fast = head;
        ListNode pre = slow;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }

        pre.next = null;
        ListNode left = insertionSortList
                (head);
        ListNode right = insertionSortList(slow);
        return merge(left, right);
    }

    private ListNode merge(ListNode l1, ListNode l2){
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        ListNode merged = new ListNode(-1);
        ListNode ptr = merged;
        while(l1 != null && l2!= null){
            if(l1.val < l2.val){
                ptr.next = l1;
                l1 = l1.next;
            }
            else{
                ptr.next = l2;
                l2 = l2.next;
            }

            ptr = ptr.next;
        }

        if(l1 != null){
            ptr.next = l1;
        } else if (l2 != null){
            ptr.next = l2;
        }

        return merged.next;
    }
}
