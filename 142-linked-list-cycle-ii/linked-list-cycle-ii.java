
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev;    
        //Step 1 detect the cycle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if( slow == fast)
                break;
        }
        //no cycle
        if(fast == null || fast.next == null) return null;
        prev = null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        return slow;


    }
}


// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         if (head == null || head.next == null) return null;

//         ListNode slow = head;
//         ListNode fast = head;

//         // Step 1: Detect cycle
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if (slow == fast) break;
//         }

//         // No cycle
//         if (fast == null || fast.next == null) return null;

//         // Step 2: Find cycle entry
//         slow = head;
//         while (slow != fast) {
//             slow = slow.next;
//             fast = fast.next;
//         }

//         return slow; // cycle starting node
//     }
// }
