package $13;


import datastructure.ListNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:37 2017/2/7.
 */
public class Method1 {
    public static void deleteNode(ListNode pListHead, ListNode pToBeDeleted) {
        if (pListHead == null || pToBeDeleted == null)
            return;
        if (pToBeDeleted.next != null) {
            pToBeDeleted.value = pToBeDeleted.next.value;
            pToBeDeleted.next = pToBeDeleted.next.next;
        } else if (pListHead == pToBeDeleted) {
            pListHead = null;
            pToBeDeleted = null;
        } else {
            ListNode listNode = pListHead;
            while (listNode.next != pToBeDeleted) {
                listNode = listNode.next;
            }
            listNode.next = null;
        }
    }
}
