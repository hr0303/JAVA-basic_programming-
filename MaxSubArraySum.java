// Given an array Arr[] of N integers.
// Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
class Solution{
    long maxSubarraySum(int arr[], int n){
        long maxSum=Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
            sum=0;
        }
        return maxSum;
        
    }
    
}
// Time Complexity: O(n^2)


// Kadane's Algorithm
long maxSubarraySum(int arr[], int n) {
    long maxEndingHere = arr[0];
    long maxSoFar = arr[0];

    for (int i = 1; i < n; i++) {
        // Calculate the maximum sum ending at the current position
        maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
        // Update maxSoFar if the maximum sum ending at the current position is greater
        maxSoFar = Math.max(maxSoFar, maxEndingHere);
    }

    return maxSoFar;
}
// Time Complexity: O(n)

