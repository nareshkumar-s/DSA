package com.linkedlist.leetcode;

public class RemoveDuplicateFromSorted83 {

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


  public ListNode deleteDuplicates(ListNode head) {
    ListNode current = head;
    while (current != null && current.next != null) {
      if (current.next.val == current.val) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
    return head;
  }
  
    public ListNode deleteDuplicates(ListNode head) {
      ListNode headCopy = head;
      ListNode tempNode = new ListNode(-1);
      tempNode.next = head;
      Set<Integer> s = new TreeSet<>();
      while(headCopy != null){
        if(s.contains(headCopy.val)){
          tempNode.next = headCopy.next;
        }
        else{
          s.add(headCopy.val);
          tempNode = tempNode.next;
        }
        headCopy = headCopy.next;
      }
      return head;
    }
}
