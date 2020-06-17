/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class SwapListNodes {
    public ListNode swapPairs(ListNode A) {
        ListNode c1=A;
        ListNode c2=A.next;
        if(c2==null)
        return A;
        ListNode ans=c2;
        ListNode prev=null;
        while(c1!=null && c2!=null){
            if(prev!=null)
            prev.next=c2;
            ListNode k=c2.next;
            c2.next=c1;
            prev=c1;
            if(k==null)
            c1.next=null;
            c1=k;
            if(c1!=null)
            c2=c1.next;
             if(c2==null)
            prev.next=c1;
        }
        return ans;
       
    }
}
