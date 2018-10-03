package $147;

import datastruc.ListNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 8:21 PM 2018/09/15.
 */
public class Solution {
    public ListNode insertsionSort(ListNode head){
        if (null == head){
            throw  new NullPointerException("head shouldn't be null!");
        }
        ListNode helper = new ListNode(0);
        ListNode cur = head, pre = helper, next;
        while (cur != null){
            next = cur.next;
            while (pre.next != null && pre.next.val < cur.val){
                pre = pre.next;
            }

            cur.next = pre.next;
            pre.next = cur;
            pre = helper;
            cur = next;
        }
        return helper.next;
    }
}
