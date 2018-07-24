package $092;

import datastruc.ListNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:42 AM 2018/07/24.
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null){
            return null;
        }
        // create a dummy node to mark the head of this list
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // make a pointer pre as a marker for the node before reversing
        ListNode pre = dummy;
        for(int i = 0; i < m-1; i++){
            pre = pre.next;
        }

        // a pointer to the beginning of a sub-list that will be reversed
        ListNode start = pre.next;
        // a pointer to a node that will be reversed
        ListNode then = start.next;

        // 1 - 2 -3 - 4 - 5 ; m=2; n =4 ---> pre = 1, start = 2, then = 3
        // dummy-> 1 -> 2 -> 3 -> 4 -> 5

        for(int i=0; i<n-m; i++) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        // first reversing : dummy->1 - 3 - 2 - 4 - 5; pre = 1, start = 2, then = 4
        // second reversing: dummy->1 - 4 - 3 - 2 - 5; pre = 1, start = 2, then = 5 (finish)
        return dummy.next;
    }
}
