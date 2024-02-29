//Given an array arr[] and an integer K where K is smaller than size of array, 
//the task is to find the Kth smallest AND Kth largest element in the given array. 
// It is given that all array elements are distinct.

import java.util.Arrays;

public class KthSmallestLargestElement {
    public static void kthElement(int[] arr,int k){
        Arrays.sort(arr);
        System.out.println(k+"th Smallest Number:"+arr[k-1]);
        System.out.println(k+"th Largest NUmber:"+arr[arr.length-k]);
    }

    public static void main(String[] args) {
        int[] arr ={3,4,5,6,7,2,1,9};
        kthElement(arr,2);
    }
}

// TIME COMPLEXITY: O(nlog n)
