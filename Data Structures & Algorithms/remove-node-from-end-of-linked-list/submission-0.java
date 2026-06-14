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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d=new ListNode(-1);
        d.next=head;
        ListNode p1=d,p2=d;
        ListNode t=p1;
        int c=1;
        while(c<=n){
            p2=p2.next;
            c++;
            if(p2==null) return head.next;
        }

        if(p2.next==null)
        {
            p1.next=null;
            return head.next;
        }

        while(p2.next!=null)
        {
            p1=p1.next;
            p2=p2.next;
        }
        
        p1.next=p1.next.next;
        return t.next;        
    }
}