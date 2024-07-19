// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
// The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.
// Example 1:
// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].
// Example 2:
// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].
// Example 3:
// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
    
        int[] arr = new int[len + 1];
        arr[0] = 1; 
        return arr;
    }
}

// Time Complexity: O(n) where n is the number of digits in the input array, due to the potential need to create a new array when all digits are 9.
// 1. How did you approach it?
//    If the last digit is smaller than 9 simply add one to the last digit. If the last digit is 9, make it 0 and add one to the next digit.
//    If all the digits are 9 crate a new array with +1 size and intialise the first element as 1. Remainign all elements will be inialised as 0 by the compiler.
// 2. What challenges did you face?
//    In witing loop to iterate when last element is 9 but all the elements are not 9.
// 3. Did you reach the most optimal solution?
//    Yes, the only way to detect if all the elements are 9 is by traversing only.
// 4. Practical aspects of this question, real world usage.
//    Could be used in digital clocks, any electronic device ehich show numeric readings. 
// 5. Did this question match with any existing pattern you already know?
//    no
