package com.linkedlist.leetcode;

public class ReverseLL206 {


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// Recursion
 public ListNode reverseList(ListNode head) {
     if(head == null || head.next == null)
         return head;
     ListNode p = reverseList(head.next);
     head.next.next = head;
     head.next = null;
    return p;
 }

//Iteration
public ListNode reverseList(ListNode head) {
  ListNode prevPtr = null;
  ListNode nextPtr = null;
  ListNode currPtr = head;

  while(currPtr != null){
    nextPtr = currPtr.next;
    currPtr.next = prevPtr;
    prevPtr = currPtr;
    currPtr = nextPtr;
  }
  return prevPtr;
}

}