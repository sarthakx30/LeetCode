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
        // ListNode currNode=head;
        // int counter=0;
        // while(currNode!=null){
        //     counter++;
        //     currNode=currNode.next;
        // }
        // ListNode c=head;
        // int count=0;
        // if(counter%2!=0){
        //     count=(counter+1)/2;
        // }
        // else{
        //     count=(counter/2)+1;
        // }
        // int i=0;
        // while(i<count-1){
        //         i++;
        //         c=c.next;
        // }
        // return c;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next==null){
            return slow;
        }
        return slow.next;
    }
}