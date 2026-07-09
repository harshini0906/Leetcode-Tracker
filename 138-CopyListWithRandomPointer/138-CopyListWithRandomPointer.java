// Last updated: 09/07/2026, 15:12:14
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> hashMap=new HashMap<>();
        Node curr=head;
        while(curr!=null) {
            hashMap.put(curr, new Node(curr.val));
            curr = curr.next; 
        }
        curr = head;
        while (curr != null) {
            Node cp = hashMap.get(curr);
            cp.next = hashMap.get(curr.next);
            cp.random = hashMap.get(curr.random);
            curr = curr.next;
        } 
        return hashMap.get(head);
    }
}