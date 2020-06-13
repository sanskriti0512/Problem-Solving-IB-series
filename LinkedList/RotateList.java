/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class RotateList {
    public ListNode reverse(ListNode A){
        ListNode prev=null;
        ListNode curr=A;
        ListNode n=null;
        if(curr!=null)
        n=curr.next;
        
        while(curr!=null){
        curr.next=prev;
        prev=curr;
        curr=n;
        if(n!=null)
        n=n.next;
        
        }
        return prev;
        //prev.next=curr;
        
    }
    public int Length(ListNode A){
        int l=0;
        while(A!=null)
        {
            A=A.next;
            l++;
        }
        return l;
    }
    public ListNode rotateRight(ListNode A, int B) {
        int i=1;
        
        ListNode k=A;
        ListNode l=A;
        int len=Length(l);
        B=B%len;
        while(i<=B && k!=null){
            
            k=k.next;
            i++;
        }
        ListNode n=A;
        while(n!=null && k.next!=null)
        {
            n=n.next;
            k=k.next;
        }
        ListNode n2=n.next;
        ListNode r2=reverse(n2);
        n.next=null;
        ListNode r1=reverse(A);
         ListNode c=r1;
       while(c.next!=null){
           c=c.next;
           
       }
       c.next=r2;
       return reverse(r1);
       
        //return A;
    }
}
