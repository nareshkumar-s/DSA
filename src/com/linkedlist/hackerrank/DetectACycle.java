package com.linkedlist.hackerrank;

public class DetectACycle {

  /*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:
    class Node {
        int data;
        Node next;
    }
*/

  boolean hasCycle(Node head) {

    if(head == null)
      return false;
    Node node1 = head;
    Node node2 = head.next;

    while(node1 != null && node2 != null && node1.next != null && node2.next != null){
      if(node1 == node2)
        return true;
      node1 = node1.next;
      node2 = node2.next.next;
    }
    return false;
  }

}
