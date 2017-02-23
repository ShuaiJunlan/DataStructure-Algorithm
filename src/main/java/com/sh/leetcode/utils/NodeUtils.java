package com.sh.leetcode.utils;

import com.sh.leetcode.base.ListNode;

/**
 * Created by Mr SJL on 2016/12/1.
 *
 * @Author Junlan Shuai
 */
public class NodeUtils
{
    /**
     * 创建一个已知长度的链表
     * @param a 链表的长度
     * @return  返回链表的头指针
     */
    public static ListNode createLink(int a)
    {
        if (a <= 0)
            return null;
        ListNode head = new ListNode(1);
        ListNode re = head;
        for (int i  = 2; i <= a; i++)
        {
            head.next = new ListNode(i);
            head = head.next;
        }
        return re;
    }

    /**
     * 打印链表所有节点的值
     * @param head
     */
    public static void printLink(ListNode head)
    {
        if (head != null)
        {
            ListNode re = head;
            System.out.println(re.val);
            while(re.next != null)
            {
                re = re.next;
                System.out.println(re.val);
            }
        }

    }

    /**
     * 打印链表所有节点的值
     * @param head
     */
    public static void printLink(ListNode head, int l)
    {
        if (l <= 0 || l > getTheLengthOfLink(head))
            return;
        if (head != null)
        {
            int t = 0;
            ListNode re = head;
            System.out.println(re.val);
            while(re.next != null && t < l)
            {
                t++;
                re = re.next;
                System.out.println(re.val);
            }
        }
    }

    /**
     * 获得链表的长度
     * @param head  头指针
     * @return  返回链表的长度
     */
    public static int getTheLengthOfLink(ListNode head)
    {
        int t = 0;
        if (head == null)
            return 0;
        while(head != null)
        {
            t++;
            head = head.next;
        }
        return t;
    }
}
