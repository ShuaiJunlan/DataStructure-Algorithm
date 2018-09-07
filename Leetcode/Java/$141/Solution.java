package $141;

import datastruc.ListNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 7:54 PM 2018/09/07.
 */
public class Solution {
    public boolean hasCycle(ListNode head){
        if (head == null){
            return false;
        }
        if (head.next == null){
            return false;
        }
        ListNode slow = head, fast = head.next.next;
        while (fast != null && fast.next != null){
            if (slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = head;
        System.out.println(solution.hasCycle(head));
    }
}
