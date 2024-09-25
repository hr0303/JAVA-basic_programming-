// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
// Return the linked list sorted as well.
// Input: head = [1,1,2]
// Output: [1,2]
// Input: head = [1,1,2,3,3]
// Output: [1,2,3]
 
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode currNode = head;
    
        while ( currNode.next != null) {
            if( currNode.val == currNode.next.val) {
                currNode.next = currNode.next.next;
            }
            else {
                currNode = currNode.next;
            }
        }
        return head;
    }
}

// Time Complexity : O(n)
