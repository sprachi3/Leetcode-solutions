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
    public ListNode deleteMiddle(ListNode head) {
        int n=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            n++;
        }

        if(n==1) return null;
        int mid;
        if(n%2==0) mid=(n/2)+1;
        else mid=(n+1)/2;

        ListNode temp=new ListNode(0,head);
        for(int i=1;i<mid;i++){
            temp=temp.next;
        }

        temp.next=temp.next.next;

        return head;
        
    }
}