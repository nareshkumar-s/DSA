package com.linkedlist.leetcode;

public class RotateList61 {
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
    public ListNode rotateRight(ListNode head, int k) {
      if(head == null || head.next == null || k == 0)
        return head;

      ListNode node1 = head;
      int len =1;
      while(node1.next != null){
        len++;
        node1 = node1.next;
      }
      int mod = k % len;
      if(mod == 0)
        return head;
      node1.next = head;

      for(int i =0; i< len - mod -1;i++){
        head = head.next;
      }
      ListNode result = head.next;
      head.next = null;

      return result;
    }
}
