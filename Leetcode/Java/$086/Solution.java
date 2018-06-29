package $086;

import datastruc.ListNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 8:36 PM 2018/06/29.
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode temp = new ListNode(0), pointer = head, tail = head;
        while (temp != null){
            if (temp.val < x){
                ListNode node = temp;
                temp = temp.next;
                if(pointer.next == null){
                    node.next = null;
                }else {
                    node.next = pointer.next.next;
                }
                pointer.next = node;

            }else {
                tail.next = temp;
                tail = temp;
                temp = temp.next;
                tail.next = null;
            }
        }
        return head.next;
    }

}
