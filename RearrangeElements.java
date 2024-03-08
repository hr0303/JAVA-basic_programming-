// An array contains both positive and negative numbers in random order. 
// Rearrange the array elements so that all negative numbers appear before all positive numbers.

import java.util.Arrays;

public class SortNegativePositiveElements {
    public static void sortElements(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] < 0) {
                left++;
            } else if (arr[right] >= 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 2, -5, 9, 7, -6};
        sortElements(arr);
    }
}
// TIME COMPLEXITY O(n)


// 2. Creating another array
import java.util.Arrays;

public class SortNegativePositiveElements {
    public static void sortElements(int[] arr){
        int[] newArr=new int[arr.length];
        int start=0;
        int end=newArr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                newArr[start]=arr[i];
                start++;
            }
            else{
                newArr[end]=arr[i];
                end--;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        int[] arr={-1,0,2,-5,9,7,-6};
        sortElements(arr);
    }
}
