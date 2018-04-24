package $024;

import datastruc.ListNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:55 2018/4/17.
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode node = head;

        //the return head
        head = head.next;
        ListNode mid = node;
        while (node != null && node.next != null){
            mid.next = node.next;
            mid = node;
            //swap two adjacent nodes
            ListNode temp = node.next.next;
            node.next.next = node;
            node.next = temp;
            node = temp;
        }
        return head;
    }
}
