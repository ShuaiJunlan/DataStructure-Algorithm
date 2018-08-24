package $086;

import datastruc.ListNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 8:36 PM 2018/06/29.
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode temp = new ListNode(0), pointer = temp, tail = temp;
        while (head != null){
            ListNode node = head;

            if (head.val < x){
                head = head.next;
                node.next = pointer.next;
                pointer.next = node;
                pointer = node;
                if (pointer.next == null){
                    tail = pointer;
                }

            }else {
                head = head.next;
                tail.next = node;
                tail = node;
                tail.next = null;
            }
        }
        return temp.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;

        temp.next = new ListNode(4);
        temp = temp.next;

        temp.next = new ListNode(3);
        temp = temp.next;

        temp.next = new ListNode(2);
        temp = temp.next;

        temp.next = new ListNode(5);
        temp = temp.next;

        temp.next = new ListNode(2);
        temp = temp.next;

        Solution solution = new Solution();
        solution.partition(head, 3);
        System.out.println(1);
    }

}
