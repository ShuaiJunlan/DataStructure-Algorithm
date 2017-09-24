package com.sh.offer;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 18:35 2017/1/18.
 */
public class $05 {
    static class Node {
        int value;
        Node next;
    }

    public static void printString(Node head) {
        if (head != null) {
            if (head.next != null) {
                printString(head.next);
            }
            System.out.println(head.value);
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node();
        node1.value = 1;

        Node node2 = new Node();
        node2.value = 2;
        node1.next = node2;

        Node node3 = new Node();
        node3.value = 3;
        node2.next = node3;

        printString(node1);

    }
}
