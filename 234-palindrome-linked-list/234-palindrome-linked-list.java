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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null){
            return true;
        }
        if(head.next.next==null){
            if(head.val!=head.next.val){
                return false;
            }
        }
        ListNode slow=head;
        ListNode fast=head;
        int count=0;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            count++;
        }
        ListNode curr=slow;
        ListNode prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        ListNode tHead=head;
        ListNode revHead=prev;
        while(revHead!=null){
            System.out.println(revHead.val);
            if(tHead.val!=revHead.val){
                return false;
            }
            revHead=revHead.next;
            tHead=tHead.next;
        }
        return true;
    }
}