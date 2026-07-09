// Last updated: 09/07/2026, 15:11:58
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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        List<Integer> res=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null) {
            res.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(res);
        curr=head;
        for(int num:res) {
            curr.val=num;
            curr=curr.next;
        }
        return head;
    }
}