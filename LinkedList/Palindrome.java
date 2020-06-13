/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Palindrome {
    public ListNode rev(ListNode A){
        ListNode head=null;
        // ListNode tail=null;
        while(A!=null){
            ListNode n=new ListNode(A.val);
            n.next=head;
            head=n;
            A=A.next;
        }
        return head;
    }
    public int lPalin(ListNode A) {
        ListNode r=rev(A);
        while(r!=null && A!=null){
            if(r.val!=A.val)
            return 0;
            r=r.next;
            A=A.next;
        }
        return 1;
    }
}
