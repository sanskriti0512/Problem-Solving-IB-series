/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Kreverse {
    public ListNode reverseList(ListNode A, int B) {
        ListNode curr=A;
        ListNode ansh=null,anst=null;
        while(curr!=null){
            int l=0;
            ListNode endk=curr;
            while(l!=B && endk!=null){
                endk=endk.next;
                l++;
            }
            ListNode head=null;
            ListNode n=null;
            ListNode tail=null;
        while(curr!=endk){
             n=new ListNode(curr.val);
             if(head==null)
             tail=n;
            n.next=head;
            head=n;
            curr=curr.next;
        }
    //    System.out.print(n.val+"*");
       if(ansh==null)
       {
           ansh=head;
           anst=tail;
       }else{
           anst.next=head;
           anst=tail;
       }
            curr=endk;
        }
        return ansh;
    }
}
