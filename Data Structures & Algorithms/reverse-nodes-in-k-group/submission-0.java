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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode gprev=dummy;

        while(true)
        {
            ListNode temp=gprev.next;
            int c=0;
            while(c<k)
            {
                if(temp==null) break;
                temp=temp.next;
                c++;
            }
            if(c<k) break;
            ListNode gnext=temp;
            ListNode khead=gprev.next;
            ListNode prev=null;
            ListNode curr=khead;
            while(curr!=gnext)
            {
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            gprev.next=prev;
                khead.next=gnext;
                gprev=khead;
        }
        return dummy.next;
        
    }
}