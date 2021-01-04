package com.linkedlist.leetcode;

public class RemoveDuplicatesFromSortedTwo82 {
  public ListNode deleteDuplicates(ListNode head) {
    if(head == null || head.next == null)
      return head;

    ListNode node = new ListNode(0);
    node.next = head;
    ListNode node1 = node;

    while(node1.next != null){
      boolean flag = false;
      ListNode node2 = node1.next;
      while(node2.next != null){
        if(node1.next.val == node2.next.val){
          flag = true;
          node2.next = node2.next.next;
        }
        else
          break;
      }
      if(flag){
        node1.next = node1.next.next;
      }
      else
        node1 = node1.next;
    }
    return node.next;
  }

}
