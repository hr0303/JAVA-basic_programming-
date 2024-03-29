/*
Given an array, rotate the array by one position in clock-wise direction.
EX:
Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4   */

class Compute {
    
    public void rotate(int arr[], int n)
    {
        int temp = arr[n-1];
        for(int i=n-1;i!=0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
}
//Time Complexity: O(n)
