package $025;

import datastruc.ListNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:02 2018/3/22.
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode node = null, linkNode = null;
        boolean tag = true;
        while (tag){

            ListNode temp = head, tempLength = head;
            for (int j = 1; j < k; j++){
                tempLength = tempLength.next;
                if (tempLength == null){
                    tag = false;
                    break;
                }
            }
            if (!tag){
                break;
            }
            for (int i = 1; i < k; i++){
                ListNode next = temp.next;
                temp.next = next.next;
                next.next = head;
                head = next;
            }

            if(linkNode != null){
                linkNode.next = head;
            }
            linkNode = temp;
            if (node == null){
                node = head;
            }

            head = temp.next;
            if (head == null){
                break;
            }
        }
        return node == null ? head : node;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
        ListNode head4 = new ListNode(5);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        Solution solution = new Solution();
        solution.reverseKGroup(head, 1);
    }
}
