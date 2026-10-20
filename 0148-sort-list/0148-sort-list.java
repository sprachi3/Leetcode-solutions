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
        if(head==null||head.next==null){
             return head;
         }

        // boolean swapped;

        // do{
        // ListNode temp=head;
        // swapped=false;

        // while(temp!=null && temp.next!=null){
        //     if(temp.val>temp.next.val){
        //         int a=temp.val;
        //         temp.val=temp.next.val;
        //         temp.next.val=a;
        //         swapped=true;
        //     }
        //     temp=temp.next;
        // }
        // }while(swapped);

        // return head;

        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;

        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }

        prev.next=null;

        ListNode left=sortList(head);
        ListNode right=sortList(slow);

        return merge(left,right);  
    }

    private ListNode merge(ListNode left,ListNode right){
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;

        while(left!=null && right!=null){
            if(left.val<=right.val){
                curr.next=left;
                left=left.next;
            }else{
                curr.next=right;
                right=right.next;
            }

            curr=curr.next;
        }

        if(left!=null){
            curr.next=left;
        }else{
            curr.next=right;
        }

        return dummy.next;
    }
}