package com.sh.leetcode.impl.reorder_list.test;

import com.sh.leetcode.base.ListNode;
import com.sh.leetcode.base.UnitTestBase;
import com.sh.leetcode.impl.reorder_list.Solution1;
import com.sh.leetcode.impl.reorder_list.Solution2;
import com.sh.leetcode.utils.NodeUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Mr SJL on 2016/12/1.
 *
 * @Author Junlan Shuai
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class App1 extends UnitTestBase
{

    @Test
    /**
     * 测试方法一（Solution1）
     */
    public void test1()
    {

        ListNode head = NodeUtils.createLink(10);
        Solution1 solution1 = new Solution1();
        begin = System.currentTimeMillis();
        solution1.reorderList(head);
        stop = System.currentTimeMillis();
        System.out.println("Total time:" + (stop -begin));
        NodeUtils.printLink(head);
//        UnitTestBase.getTotalTime();

    }

    @Test
    /**
     * 测试方法一（Solution1）
     */
    public void test2()
    {
        ListNode head = null;
        Solution1 solution1 = new Solution1();
        solution1.reorderList(head);
        NodeUtils.printLink(head);
    }

    @Test
    /**
     * 测试方法一（Solution1）
     */
    public void test3()
    {
        ListNode head = new ListNode(1);
        Solution1 solution1 = new Solution1();
        solution1.reorderList(head);
        NodeUtils.printLink(head);
    }

    @Test
    /**
     * 测试方法二（Solution2）
     */
    public void test4()
    {
        ListNode head = NodeUtils.createLink(10);
        Solution2 solution2 = new Solution2();
        solution2.reorderList(head);
        NodeUtils.printLink(head);
    }

}
