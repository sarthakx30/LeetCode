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
        //Single Node then palindrome
        if(head.next==null){
            return true;
        }
        //Slow pointer marks the middle of list
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //Reverse the second half of list
        ListNode curr=slow;
        ListNode prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        //Compare the two Pointers
        ListNode tHead=head;
        ListNode revHead=prev;
        while(revHead!=null){
            if(tHead.val!=revHead.val){
                return false;
            }
            revHead=revHead.next;
            tHead=tHead.next;
        }
        return true;
    }
}