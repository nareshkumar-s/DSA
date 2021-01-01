package com.linkedlist.hackerrank;

import java.io.*;

public class InsertNodeAtPosition {
     /*
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode = head;
        if (head == null)
            return head;
        else if (position == 1) {
        } else {
            int i = 1;
            while (i < position) {
                newNode = newNode.next;
                i++;
            }
        }
        SinglyLinkedListNode tempNode = new SinglyLinkedListNode(data);
        tempNode.next = newNode.next;
        newNode.next = tempNode;
        return head;
    }
}
