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
class Solution {
    public void reorderList(ListNode head) {
      ListNode fast = head.next;
      ListNode slow = head;

      while(fast != null && fast.next != null)  
      {
        slow = slow.next;
        fast = fast.next.next;
      }
      //i found the middle here
//now i have to split them and reverse them 
      ListNode second = slow.next; //this is the first list
      ListNode prev = slow.next = null; // this is the second list bro 

      //now i have reverse to 

        while(second != null)
        {
            ListNode tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }

// learn this bhai
    ListNode first = head;
    second = prev;
    while(second !=null)
    {
        ListNode tmp1 = first.next;
        ListNode tmp2 = second.next;
        first.next = second;
        second.next = tmp1;
        first = tmp1;
        second = tmp2;
    }
    }
}