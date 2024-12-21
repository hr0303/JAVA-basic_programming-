// Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
// Input: head = [1,2,6,3,4,5,6], val = 6
// Output: [1,2,3,4,5]

// Input: head = [], val = 1
// Output: []

// Input: head = [7,7,7,7], val = 7
// Output: []
 
 class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        while(head != null && head.val == val){
            head = head.next;
        }

        ListNode last = head;

        if(head == null) {
            return null;
        }
        
        while(last.next != null) {
            if(last.next.val == val) {
                last.next = last.next.next;
            }
            else { 
                last = last.next;
            }
        }
        return head;
    }
}

// Time Complexity : O(n)

