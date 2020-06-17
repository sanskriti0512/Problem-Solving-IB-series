/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class InsertionSortLL {
    public ListNode insertionSortList(ListNode A) {
        ListNode ansh=null;
        ListNode curr=A;
        while(curr!=null){
             ListNode n=new ListNode(curr.val);
            ListNode p=null;
            ListNode c=ansh;
            if(c==null){
                ansh=n;
                ansh.next=null;
            }else{
                while(c!=null && c.val<curr.val){
                    p=c;
                    c=c.next;
                }
                if(p!=null){
               p.next=n;
               n.next=c;
                }else{
                    n.next=c;
                    ansh=n;
                }
            }
            curr=curr.next;
        }
        return ansh;
    }
}
