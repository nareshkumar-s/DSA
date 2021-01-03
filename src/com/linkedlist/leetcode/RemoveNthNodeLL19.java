package com.linkedlist.leetcode;

public class RemoveNthNodeLL19 {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head == null)
      return head;
    if(n == 0)
      return head;

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode first = dummy;
    ListNode second = dummy;

    for(int i=0;i<=n && first != null;i++){
      first = first.next;
    }
    if(first == null && n ==1 )
      return first;
    while(first != null){
      first = first.next;
      second = second.next;
    }
    second.next = second.next.next;

    return dummy.next;
  }
}
