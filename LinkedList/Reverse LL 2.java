/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        ListNode curr=A;
        ListNode prev=null;
        int i=1;
        while(i<B && curr!=null){
            prev=curr;
            curr=curr.next;
            i++;
        }
        ListNode r=null;
        ListNode end=null;
        ListNode Ai=curr;
        while(i<=C && Ai!=null){
            ListNode n=new ListNode(Ai.val);
            if(r==null)
            end=n;
            n.next=r;
            r=n;
            Ai=Ai.next;
            i++;
        }
     
        if(end!=null){
        end.next=Ai;
           //System.out.print(Ai.val+"*");
        }
        if(prev!=null){
        prev.next=r;
        
        return A;
        }
           
        return r;
        
    }
}
