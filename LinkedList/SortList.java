/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class SortList {
     public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode ans=null;
        ListNode tail=null;
        ListNode i=A;
        ListNode j=B;
        while(i!=null && j!=null){
            if(i.val<=j.val){
                ListNode n=new ListNode(i.val);
                if(ans==null){
                    ans=n;
                    tail=n;
                }else{
                    tail.next=n;
                    tail=tail.next;
                }
                i=i.next;
            }
            else if(i.val>j.val){
                ListNode n=new ListNode(j.val);
                if(ans==null){
                    ans=n;
                    tail=n;
                }else{
                    tail.next=n;
                    tail=tail.next;
                }
                j=j.next;
            }
        }
        while(i!=null){
            ListNode n=new ListNode(i.val);
                if(ans==null){
                    ans=n;
                    tail=n;
                }else{
                    tail.next=n;
                    tail=tail.next;
                }
                i=i.next;
        }
        while(j!=null){
            ListNode n=new ListNode(j.val);
                if(ans==null){
                    ans=n;
                    tail=n;
                }else{
                    tail.next=n;
                    tail=tail.next;
                }
                j=j.next;
            
        }
        return ans;
    }
    public ListNode sortList(ListNode A) {
        ListNode prev=null;
        ListNode slow=A;
        ListNode fast=A.next;
        if(fast==null)
        return A;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev!=null)
        prev.next=null;
        if(prev==null && slow.next==null)
        return slow;
         ListNode B;
        if(prev==null && slow.next.next==null){
        B=slow.next;
        slow.next=null;
        }
        else
        B= slow;
        A=sortList(A);
        B=sortList(B);
        return mergeTwoLists(A, B);
    }
}
