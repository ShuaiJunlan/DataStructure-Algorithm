package $160;

import datastruc.ListNode;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:20 PM 2/21/19.
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        ListNode tempA = headA, tempB= headB;
        int a = 0;
        while (tempA != null){
            tempA = tempA.next;
            a++;
        }
        int b = 0;
        while (tempB != null){
            tempB = tempB.next;
            b++;
        }
        if (a > b){
            int temp = a - b;
            while (temp != 0){
                headA = headA.next;
                temp--;
            }
        }else {
            int temp = b - a;
            while (temp != 0){
                headB = headB.next;
                temp--;
            }
        }
        while (headA != null && headB != null){
            if (headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
