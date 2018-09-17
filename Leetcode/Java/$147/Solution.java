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
        ListNode temp = head.next;
        while (temp != null){

        }
        return head;
    }
    private void swapVal(ListNode a, ListNode b){
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
    }
}
