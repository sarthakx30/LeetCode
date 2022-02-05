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
    public ListNode mergeKLists(ListNode[] lists) {
        // My Solution runs for test cases but fails at [[1],[0]] -- Output - [1] Expected - [0,1] ; idk why
        
        // int k=lists.length;
        // if(k==0){
        //     return null;
        // }else if(k==1){
        //     return lists[0];
        // }
        // for(int i=1;i<k;i++){
        //     ListNode prev=new ListNode();
        //     ListNode index=lists[0];
        //     prev.next=index;
        //     ListNode curr=lists[i];
        //     if(lists[0]==null){
        //         lists[0]=lists[i];
        //         break;
        //     }
        //     while(index!=null && curr!=null){
        //         if(curr.val<index.val){
        //             ListNode temp=curr.next;
        //             prev.next=curr;
        //             curr.next=index;
        //             curr=temp;
        //             //prev=prev.next;
        //         }
        //         else{
        //             index=index.next;
        //             //prev=prev.next;
        //         }
        //         prev=prev.next;
        //     }
        //     while(curr!=null){
        //         prev.next=curr;
        //         curr=curr.next;
        //     }
        // }
        // return lists[0];
        
        //Similar approach but with god knows what magic
        
        if (lists == null || lists.length == 0) {
            return null;
          }
          // Use the 0-th list as a return list
          for (int i = 1; i < lists.length; ++i) {
            lists[0] = mergeList(lists[0], lists[i]);
          }

          return lists[0];
        }

        private ListNode mergeList(ListNode n1, ListNode n2) {
          ListNode dummy = new ListNode(-1);
          ListNode prev = dummy;
          while (n1 != null && n2 != null) {
            if (n1.val < n2.val) {
              prev.next = n1;
              n1 = n1.next;
            } else {
              prev.next = n2;
              n2 = n2.next;
            }
            prev = prev.next;
          }
          prev.next = (n1 != null) ? n1 : n2;

          return dummy.next;
    }
}