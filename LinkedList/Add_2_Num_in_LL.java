/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Add_2_Num_in_LL {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        int s=0,c=0;
        ListNode i=A;
        ListNode j=B;
        ListNode head=null;
        ListNode tail=null;
        while(i!=null && j!=null){
            int k=i.val+j.val+c;
            s=k%10;
            c=k/10;
            ListNode n=new ListNode(s);
            if(head==null){
                head=n;
                tail=n;
            }else{
                tail.next=n;
                tail=n;
            }
            i=i.next;
            j=j.next;
        }
        
        while(i!=null)
        {
             int k=i.val+c;
            s=k%10;
            c=k/10;
            ListNode n=new ListNode(s);
            if(head==null){
                head=n;
                tail=n;
            }else{
                tail.next=n;
                 tail=n;
            }
             i=i.next;
        }
        while(j!=null)
        {
             int k=j.val+c;
            s=k%10;
            c=k/10;
            ListNode n=new ListNode(s);
            if(head==null){
                head=n;
                tail=n;
            }else{
                tail.next=n;
                 tail=n;
            }
             j=j.next;
        }
        if(c!=0){
            ListNode n=new ListNode(c);
            if(head==null){
                head=n;
                tail=n;
            }else{
                tail.next=n;
                 tail=n;
            }
        }
        return head;
    }
}
