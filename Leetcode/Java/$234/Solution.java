package $234;

import datastruc.ListNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 2:25 PM 4/17/19.
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        while (slow != null && fast != null){
            if (slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
     }
    private ListNode reverse(ListNode node){
        ListNode pre = node, next = node.next;
        while (next != null){
            ListNode temp = next.next;
            node.next = temp;
            next.next = pre;
            pre = next;
            next = temp;
        }
        return pre;
    }
}
