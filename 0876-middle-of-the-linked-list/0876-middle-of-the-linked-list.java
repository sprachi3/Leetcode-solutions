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
    public ListNode middleNode(ListNode head) {
        int n=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            n++;
        }

        int mid;
        if(n%2==0) mid=(n/2)+1;
        else mid=(n+1)/2;

        for(int i=1;i<mid;i++){
            head=head.next;
        }

        //head=head.next;
        return head;
        
    }
}