// Last updated: 09/07/2026, 15:14:09
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode();
        ListNode res=dummy;
        int t=0,c=0;
        while(l1!=null || l2!=null || c!=0) {
            t=c;
            if(l1!=null) {
                t+=l1.val;
                l1=l1.next;
            }
            if(l2!=null) {
                t+=l2.val;
                l2=l2.next;
            }
            int num=t%10;
            c=t/10;
            dummy.next=new ListNode(num);
            dummy=dummy.next;
        }
        return res.next;
    }
}