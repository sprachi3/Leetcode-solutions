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
        ListNode curr=head;
        int k=0;
        if(head==null) return null;

        while(curr!=null){
            curr=curr.next;
            k++;
        }

        if(n==k) return head.next;

        ListNode temp=head;

        for(int i=1;i<k-n;i++){
            temp=temp.next;
        }

        temp.next=temp.next.next;

        return head;
        
    }
}