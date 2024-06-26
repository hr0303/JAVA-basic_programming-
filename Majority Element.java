// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. 
// You may assume that the majority element always exists in the array.
// Example 1:
// Input: nums = [3,2,3]
// Output: 3
// Example 2:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int max_count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int count = 1; // Starting from 1 because we are counting the current element itself
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > max_count) {
                max_count = count;
                majorityElement = nums[i];
            }
        }
        
        return majorityElement;
    }
}

// Time Complexity: O(n^2)
