/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 There is only one repeated number in nums, return this repeated number.
 You must solve the problem without modifying the array nums and uses only constant extra space.
Example 1:
Input: nums = [1,3,4,2,2]
Output: 2
  Example 2:
Input: nums = [3,1,3,4,2]
Output: 3                     */

lass Solution {
    public int findDuplicate(int[] nums) {
        int[] ans=new int[nums.length] ;
        int a=0;
        for (int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        Arrays.sort(ans);
        for(int i=0;i<nums.length-1;i++){
            if(ans[i]==ans[i+1]){
                a=ans[i];
                
            }
        }
        return a;
        
    }
}

//time complexity = n(log n) (because Arrays.sort is used)
