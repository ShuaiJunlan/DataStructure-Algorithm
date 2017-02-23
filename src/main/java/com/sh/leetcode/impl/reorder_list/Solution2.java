package com.sh.leetcode.impl.reorder_list;

import com.sh.leetcode.base.ListNode;

/**
 * Created by Mr SJL on 2016/12/1.
 *
 * @Author Junlan Shuai
 */

/**
 * 此方法超时，还有待优化
 */
public class Solution2
{
    public void reorderList(ListNode head)
    {
        ListNode re = head;
        if (head != null)
        {
            while (re.next != null && re.next.next != null)
            {
                insertNode(re, getTheLastNode(re));
                re = re.next.next;
            }
        }
    }
    /**
     * 获得某个链表的倒数第二个节点
     * @param node  链表的头指针
     * @return      返回链表的大倒数第二个指针
     */
    public ListNode getTheLastNode(ListNode node)
    {
        while (node.next.next != null)
        {
            node = node.next;
        }
        return node;
    }

    /**
     * 将node2节点插入node1节点之后，原始链表保持不变
     * @param node1 已知节点
     * @param node2 待插入的节点
     */
    public void insertNode(ListNode node1, ListNode node2)
    {
        ListNode tmp;
        tmp = node1.next;
        node1.next = node2.next;
        node1.next.next = tmp;
        node2.next = null;
    }


}
