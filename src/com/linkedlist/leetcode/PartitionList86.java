package com.linkedlist.leetcode;

public class PartitionList86 {

  public ListNode partition(ListNode head, int x) {
    if(head == null)
      return head;
    ListNode node = head;
    ListNode node1 = new ListNode(0);
    ListNode node2 = new ListNode(0);
    ListNode node1Copy = node1;
    ListNode node2Copy = node2;
    while(node != null){
      if(node.val < x){
        node1.next = node;
        node1=node1.next;
      }
      else{
        node2.next = node;
        node2 = node2.next;
      }
      node = node.next;
    }
    node2.next = null;
    node1.next = node2Copy.next;
    return node1Copy.next;
  }

}
