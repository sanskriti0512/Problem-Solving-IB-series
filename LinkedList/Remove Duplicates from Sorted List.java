/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode i=A;
        ListNode j=A.next;
        while(i!=null && j!=null)
        {
            if(i.val==j.val){
                j=j.next;
            }else{
                i.next=j;
                i=i.next;
            }
        }
         i.next=j;
                i=i.next;
         return A;       
    }
}
