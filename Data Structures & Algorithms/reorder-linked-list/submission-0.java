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
        
            ///MIDDLE FINDING WITH SLOW AND FAST
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast !=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        /// AFTER THE LOOP IS OVER 

        ListNode second = slow.next;
        ListNode prev = slow.next = null; //putting null to the old list 

        while(second != null)
        {
            ListNode tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }

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
