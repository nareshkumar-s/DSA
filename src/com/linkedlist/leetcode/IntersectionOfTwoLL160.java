package com.linkedlist.leetcode;

public class IntersectionOfTwoLL160 {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    //Using HashSet
    if(headA == null || headB == null)
      return null;
    Set<ListNode> s = new HashSet<>();
    while(headA != null){
      s.add(headA);
      headA = headA.next;
    }
    while(headB != null){
      if(s.contains(headB))
        return headB;
      else{
        headB = headB.next;
      }
    }
    return null;

    // Bruteforce
    // if(headA == null || headB == null)
    //     return null;
    // ListNode node1 = headA;
    // while(node1 != null){
    //     ListNode node2 = headB;
    //     while(node2 != null){
    //         if(node1 == node2){
    //             return node1;
    //         }
    //         else{
    //             node2 = node2.next;
    //         }
    //     }
    //     node1 = node1.next;
    // }
    // return null;
  }

}
