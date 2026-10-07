/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int n=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            n++;
        }
        k=k%n;
        if(k==0) return head;
        ListNode ahead=head.next;
        ListNode before=head;
        while(k-->0)
        {
            while(ahead.next!=null)
            {
                   before=ahead;
                ahead=ahead.next;
            }
            ahead.next=head;
            before.next=null;
            head=ahead;
        }
        return ahead;
    }
}