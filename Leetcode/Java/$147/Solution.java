package $147;

import datastruc.ListNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 8:21 PM 2018/09/15.
 *
 * TODO: https://leetcode.com/problems/insertion-sort-list/discuss/46420/An-easy-and-clear-way-to-sort-(-O(1)-space-)
 */
public class Solution {
    public ListNode insertionSortList(ListNode head){
        if (null == head){
            return null;
        }

        ListNode helper = new ListNode(0);
        ListNode cur = head;
        ListNode pre = helper;

        ListNode next = null;
        while (cur != null){
            next = cur.next;

            while (pre.next != null && cur.val >= pre.next.val){
                pre = pre.next;
            }

            cur.next = pre.next;
            pre.next = cur;

            cur = next;
            pre = helper;
        }
        return helper.next;
    }
}
