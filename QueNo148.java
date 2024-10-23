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
    public ListNode sortList(ListNode head) {
        // Base case: if the list is empty or has only one element
        if (head == null || head.next == null) {
            return head;
        }
        
        // Get the middle node of the list
        ListNode mid = getMid(head);
        
        // Recursively sort the left and right halves
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        
        // Merge the sorted halves and return
        return mergeTwoLists(left, right);
    }

    public ListNode getMid(ListNode head) {
        // Using slow and fast pointers to find the mid node
        ListNode slow = head;
        ListNode fast = head.next; // start fast one step ahead
        
        while (fast != null && fast.next != null) {
            slow = slow.next;         // move slow by one
            fast = fast.next.next;   // move fast by two
        }
        
        ListNode mid = slow.next;   // mid is the next of slow
        slow.next = null;            // split the list into two halves
        return mid;                  // return the mid node
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy head for the merged list
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy; // Pointer to build the new list
        
        // Merge the two lists
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next; // Move the tail
        }
        
        // If any elements left in either list, attach it
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }
        
        return dummy.next; // Return the merged list, skipping the dummy head
    }
}
