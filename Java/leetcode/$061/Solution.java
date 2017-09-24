package com.sh.leetcoder.$061;

import com.sh.leetcoder.datastruc.ListNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:52 2017/5/2.
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        int length = 1;
        ListNode temp_head = head, temp_node = head;
        while (temp_head.next != null){
            length++;
            temp_head = temp_head.next;
        }
        int nth = length - k % length;
        while (nth > 1){
            temp_node = temp_node.next;
            nth--;
        }
        temp_head.next = head;
        ListNode node = temp_node.next;
        temp_node.next = null;
        return node;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
        Solution solution = new Solution();
        solution.rotateRight(head, 5);

    }
}
