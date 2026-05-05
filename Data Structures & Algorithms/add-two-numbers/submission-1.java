class Solution {

    // 🔁 recursive helper
    public ListNode add(ListNode l1, ListNode l2, int carry) {

        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int v1 = (l1 != null) ? l1.val : 0;
        int v2 = (l2 != null) ? l2.val : 0;

        int sum = v1 + v2 + carry;

        int nodeValue = sum % 10;
        int newCarry = sum / 10;

        ListNode nextNode = add(
            (l1 != null) ? l1.next : null,
            (l2 != null) ? l2.next : null,
            newCarry
        );

        return new ListNode(nodeValue, nextNode);
    }

    // 🚀 main function
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }
}