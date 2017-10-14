package $206;

import datastruc.ListNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 17:40 2017/5/2.
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        if (head.next == null) return head;
        ListNode temp_node = head.next, temp_head = head;
        while (head.next != null){
            head.next = temp_node.next;
            temp_node.next = temp_head;
            temp_head = temp_node;
            temp_node = head.next;
        }
        return temp_head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        Solution solution = new Solution();
        solution.reverseList(head);
    }
}
