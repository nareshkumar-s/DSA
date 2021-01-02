package com.linkedlist.hackerrank;

public class MergePointOf2Lists {

  /*
   * SinglyLinkedListNode {
   *     int data;
   *     SinglyLinkedListNode next;
   * }
   */
  static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    while(head1 != null){
      SinglyLinkedListNode temp = head2;
      while(temp != null){
        if(head1 == temp)
          return head1.data;
        temp = temp.next;
      }
      head1 = head1.next;
    }
    return -1;
  }

}
