package com.sh.leetcode.impl.reorder_list;

import com.sh.leetcode.base.ListNode;

/**
 * Created by Mr SJL on 2016/12/1.
 *
 * @Author Junlan Shuai
 */

/**
 * 此方法通过
 */
public class Solution1
{
    public void reorderList(ListNode head)
    {
        /**
         * 链表为空直接返回
         */
        if (head == null)
            return;
        ListNode slow = head;
        ListNode fast = head;

        /**
         * 通过快慢指针找到链表的中点
         */
        while (fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        /**
         * 以获得的中点为起点，将原始链表的后半部分倒置
         */
        ListNode pre = slow.next;
        if (pre != null && pre.next != null)
        {
            ListNode nex = pre.next;
            while (nex != null)
            {
                pre.next = nex.next;
                nex.next = slow.next;
                slow.next = nex;
                nex = pre.next;
            }
        }
        /**
         * 将两个链表交叉插入，采用后插法
         */
        merge1(head, slow);

    }

    /**
     * 实现两个链表的交叉插入（第一种方式）
     * @param h1    第一条链表的头指针
     * @param h2    第二条链表的头指针的父指针
     */
    public void merge1(ListNode h1, ListNode h2)
    {
        ListNode h = h1;
        ListNode t = h2.next;
        h2.next = null;
        while(h != null && t != null)
        {
            ListNode tmp1 = h.next;
            h.next = t;
            ListNode tmp2 = t.next;
            t.next = tmp1;
            t = tmp2;
            h = h.next.next;
        }
    }
    /**
     * 实现两个链表的交叉插入（第二种方式）
     * @param head    第一条链表的头指针
     * @param slow    第二条链表的头指针的父指针
     */
    public void merge(ListNode head, ListNode slow)
    {
        ListNode p = head;
        ListNode q = slow.next;
        while (q != null && p != null)
        {
            slow.next = q.next;
            q.next = p.next;
            p.next = q;
            q = slow.next;
            p = p.next.next;
        }
    }
}
