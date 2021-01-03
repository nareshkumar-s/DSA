package com.linkedlist.leetcode;

public class LLCycleTwo142 {

  /**
   * Definition for singly-linked list.
   * class ListNode {
   *     int val;
   *     ListNode next;
   *     ListNode(int x) {
   *         val = x;
   *         next = null;
   *     }
   * }
   */

    // Using Set
    public ListNode detectCycle(ListNode head) {
      if(head == null)
        return null;

      Set<ListNode> s = new HashSet<>();
      while(head != null){
        if(s.contains(head))
          return head;
        else{
          s.add(head);
          head = head.next;
        }
      }
      return null;
    }



    // Using Floyd algorithms

    public ListNode detectCycle(ListNode head) {
      if(head == null)
        return null;

      ListNode intersectionPoint = getIntersection(head);
      if(intersectionPoint == null)
        return null;
      ListNode p1 = head;
      ListNode p2 = intersectionPoint;

      while(p1 != p2){
        p1 = p1.next;
        p2 = p2.next;
      }
      return p1;
    }

    public ListNode getIntersection(ListNode head) {
      if(head == null || head.next == null)
        return null;
      ListNode p1 = head;
      ListNode p2 = head;

      while(p1 != null && p2 != null && p1.next != null && p2.next != null){
        p1 = p1.next;
        p2 = p2.next.next;
        if(p1 == p2){
          return p1;
        }
      }
      return null;
    }
  }

