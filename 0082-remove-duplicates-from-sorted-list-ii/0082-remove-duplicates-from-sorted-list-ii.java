
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode current = head;
        ListNode prev = dummy;
        while (current != null) {
            if (current.next != null && current.val == current.next.val) {
                int dup = current.val;
                while (current != null && current.val == dup) {
                    current = current.next;
                }
                prev.next = current;
            }
            else {
                prev = current;
                current = current.next;
            }
        }
        return dummy.next;
    }
}
