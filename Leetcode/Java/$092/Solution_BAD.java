package $092;

import datastruc.ListNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:47 AM 2018/07/24.
 */
public class Solution_BAD {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode tempHeadPre = null, tempHead = head, next;
        int i = 1;
        while (i < m){
            tempHeadPre = tempHead;
            tempHead = tempHead.next;
            i++;
        }
        next = tempHead.next;
        ListNode tail = tempHead;
        while (i < (m + n - 2)){
            tempHeadPre.next = next;
            tail.next = next.next;
            next.next = tempHead;
            next = tempHead.next;
            tempHead = tempHeadPre.next;
            i++;
        }
        return head;
    }
}
