package com.linkedlist.leetcode;

public class RemoveLLElement203 {
  public ListNode removeElements(ListNode head, int val) {

    if(head == null)
      return null;
    if(head.next == null && head.val == val)
      return null;

    ListNode node1 = new ListNode(0);
    node1.next = head;
    ListNode result = node1;
    while(node1 != null && node1.next != null){
      if(val == node1.next.val){
        node1.next = node1.next.next;
      }
      else{
        node1 = node1.next;
      }
    }
    return result.next;
  }
}
