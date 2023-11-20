/*Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
Return the decimal value of the number in the linked list.
The most significant bit is at the head of the linked list.
Eg:Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10  */

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
    static int power(int a,int p){
        if (p==0){
            return 1;
        }
        else if (p==1){
            return a;
        }
        else{
            return (a*(power(a,p-1)));
        }
    }
    public int getDecimalValue(ListNode head) {
        int counter=0;
        int ans=0;
        ListNode temp=head;
        while(temp!=null){
            counter++;
            temp=temp.next;
        }
        temp=head;
        for(int i=counter-1;i>=0;i--){           
            ans=ans+temp.val*power(2,i);
            temp=temp.next;
        }
        return ans;
    }
}
//time complexity n^2
