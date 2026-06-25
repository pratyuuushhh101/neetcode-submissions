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
        
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int c=0,sum=0;
        while(l1!=null && l2!=null)
        {
            ListNode newNode=new ListNode();
            curr.next=newNode;
            curr=curr.next;
            sum=l1.val+l2.val+c;
            curr.val=sum%10;
            c=sum/10;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null)
        {
            ListNode newNode=new ListNode();
            curr.next=newNode;
            curr=curr.next;
            curr.val=(l1.val+c)%10;
            c=(l1.val+c)/10;
            l1=l1.next;
        }
        while(l2!=null)
        {
            ListNode newNode=new ListNode();
            curr.next=newNode;
            curr=curr.next;            
            curr.val=(l2.val+c)%10;
            c=(l2.val+c)/10; 
            l2=l2.next;
        }
        if(c>0){
            ListNode newNode=new ListNode(c);
            curr.next=newNode;
        }
        return dummy.next;
    }
    
}