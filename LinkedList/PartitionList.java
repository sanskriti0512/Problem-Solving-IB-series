/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class PartitionList {
    public ListNode partition(ListNode A, int B) {
        ListNode lessh=null;
        ListNode lesst=null;
        ListNode moreh=null;
        ListNode moret=null;
        while(A!=null){
            if(A.val<B){
                if(lessh==null){
                    lessh=A;
                    lesst=A;
                    //lesst.next=null;
                }else{
                    lesst.next=A;
                    lesst=lesst.next;
                 //   lesst.next=null;
                }
            }else{
                 if(moreh==null){
                    moreh=A;
                    moret=A;
                  //  moret.next=null;
                }else{
                    moret.next=A;
                    moret=moret.next;
                 //   moret.next=null;
                }
            }
            A=A.next;
        }
        if(lessh==null)
        return moreh;
        lesst.next=moreh;
        moret.next=null;
        return lessh;
    }
}
