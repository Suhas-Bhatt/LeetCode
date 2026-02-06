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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n > size){
            throw new IllegalArgumentException("n is greater than size of the list");
        }

        if(n==size){
            return head.next;
        }

        int i = 1;
        int itoFind = size - n;
        ListNode prev = head;
        while(i<itoFind){
            prev = prev.next;
            i++;
        } 

        prev.next = prev.next.next;
        return head;
    }
}