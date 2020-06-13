/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class deleteDuplicates2 {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode head=A;
         ListNode i=A;
         ListNode prev=null;
        ListNode j=A.next;
        while(i!=null && j!=null)
        {
            if(i.val==j.val){
                j=j.next;
            }else{
               if(i.next!=j){
                   if(head==i){
                       head=j;
                       i=j;
                   }else{
                       prev.next=j;
                       i=j;
                   }
               }else{
                   prev=i;
                   i=i.next;
               }
            }
        }
          if(i.next!=j){
                   if(head==i){
                       head=j;
                   }else{
                       prev.next=j;
                   }
               }else{
                   prev=i;
                   i=i.next;
               }
         return head;      
    }
}
