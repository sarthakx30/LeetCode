/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        // My original solution with O(n) Space Complexity
        // Stack<Node> s=new Stack<>();
        // Node curr=head;
        // while(curr!=null){
        //     if(curr.next==null && s.isEmpty()==false){
        //         curr.next=s.pop();
        //         curr.next.prev=curr;
        //     }
        //     if(curr.child!=null){
        //         if(curr.next!=null){
        //             s.push(curr.next);
        //         }
        //         curr.next=curr.child;
        //         curr.next.prev=curr;
        //         curr.child=null;
        //     }
        //     curr=curr.next;
        // }
        // return head;
        // O(1) Space Complexity
        if(head==null){
            return head;
        }
        Node curr=head;
        while(curr!=null){
            if(curr.child!=null){
                Node temp=curr.child;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=curr.next;
                if(curr.next!=null){
                    curr.next.prev=temp;
                }
                curr.next=curr.child;
                curr.next.prev=curr;
                curr.child=null;
            }
            curr=curr.next;
        }
        return head;
    }
}