/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class ListCycle {
    public ListNode detectCycle(ListNode a) {
        ListNode s=a;
        ListNode f=a;
       while (s != null && f != null && f.next != null) { 
            s = s.next; 
            f = f.next.next; 
            if (s == f) { 
               break;
            } 
        }
        if(s==null ||f==null || f.next==null)
        return null;
        
        int l=1;
        ListNode d=a;
       
       while(d!=f){
           d=d.next;
           f=f.next;
       } 
       return d;
       
    }
}
