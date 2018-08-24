package $445;

import datastruc.ListNode;

import java.util.Stack;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:18 2017/5/2.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ListNode l1_temp = l1, l2_temp = l2;
        while (l1_temp != null) {
            stack1.add(l1_temp.val);
            l1_temp = l1_temp.next;
        }
        while (l2_temp != null) {
            stack2.add(l2_temp.val);
            l2_temp = l2_temp.next;
        }
        ListNode listNode = new ListNode(0);
        int sum = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (!stack1.isEmpty()) sum += stack1.pop();
            if (!stack2.isEmpty()) sum += stack2.pop();
            listNode.val = sum % 10;

            ListNode node = new ListNode(sum / 10);
            node.next = listNode;
            listNode = node;
            sum /= 10;
        }
        return listNode.val == 0 ? listNode.next : listNode;
    }
}
