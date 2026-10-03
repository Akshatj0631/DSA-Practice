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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> v=new Stack<Integer>();
        ListNode temp=head;
        while(temp!=null)
        {
            v.push(temp.val);
            temp=temp.next;
        }
        ListNode temp1=head;
        while(temp1!=null)
        {
            int value=temp1.val;
            if(value!=v.pop())
            return false;
            temp1=temp1.next;
        }
        return true;


    }
}