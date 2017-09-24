package com.sh.leetcoder.$002;

import com.sh.leetcoder.datastruc.ListNode;


/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:27 2017/5/2.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode head = new ListNode(0);
        ListNode temp_head = head;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            temp_head.val = sum % 10;
            temp_head.next = new ListNode(sum / 10);
            if (l1 == null && l2 == null && temp_head.next.val == 0) {
                temp_head.next = null;
                return head;
            }
            temp_head = temp_head.next;
            sum /= 10;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(9);
        listNode1.next = new ListNode(9);
        Solution solution = new Solution();

        solution.addTwoNumbers(listNode, listNode1);
    }
}
