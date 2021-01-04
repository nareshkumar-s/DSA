package com.linkedlist.leetcode;

public class LLCycleOne141 {

  public boolean hasCycle(ListNode head) {

    // if(head == null || head.next == null)
    //     return false;
    // Set<ListNode> s = new HashSet<>();
    // while(head != null){
    //     if(s.contains(head))
    //         return true;
    //     s.add(head);
    //     head = head.next;
    // }
    // return false;

    if(head == null || head.next == null)
      return false;

    ListNode p1 = head;
    ListNode p2 = head;
    while(p1 != null && p2 != null && p1.next != null && p2.next != null){
      p1 = p1.next;
      p2 = p2.next.next;
      if(p1 == p2)
        return true;
    }
    return false;

  }

}
