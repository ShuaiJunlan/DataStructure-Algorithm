package $023;

import datastruc.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:01 2018/3/21.
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0){
            return null;
        }
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val < o2.val){
                    return -1;
                }else if (o1.val == o2.val){
                    return 0;
                }else {
                    return 1;
                }
            }
        });

        ListNode head = new ListNode(0);
        ListNode tail = head;
        for (ListNode node : lists){
            //  Determine if node is null
            if (node != null) {
                priorityQueue.add(node);
            }
        }
        while (!priorityQueue.isEmpty()){
            tail.next = priorityQueue.poll();
            tail = tail.next;
            if (tail.next != null){
                priorityQueue.add(tail.next);
            }
        }
        return head.next;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(3);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(5);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}
