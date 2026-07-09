// Last updated: 09/07/2026, 15:12:01
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
    public ListNode insertionSortList(ListNode head) {
        ListNode ln=new ListNode(0);
        while(head!=null) {
            ListNode curr=head;
            head=head.next;
            ListNode prev=ln;
            while(prev.next!=null && prev.next.val<curr.val){
                prev=prev.next;
            }
            curr.next=prev.next;
            prev.next=curr;
        }
        return ln.next;
    }
}