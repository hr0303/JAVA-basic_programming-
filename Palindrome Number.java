// Given an integer x, return true if x is a palindrome, and false otherwise.
// Example 1:
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:
// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) 
            return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
}
// Time complexity: O(log n)

// 1. How did you approach it?
//     idea is to find the the face value of the number and then multiply it with repective place value. 
//     To find the face value given number is divided with 10  and remainder is stored in other variable as the reverse number.
// 2. What challenges did you face?
//     Determining the constraints where pallindrome numb could not be found.
// 3. Did you reach the most optimal solution?
//     Yes, Time Complexity is O(log n)
// 4. Practical aspects of this question, real world usage.
//     Pallindrome sequence in genetic material have great importance 
// 5. Did this question match with any existing pattern you already know?
//     no.
