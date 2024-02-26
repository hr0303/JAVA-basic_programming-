// REVERSING AN ARRAY USING ANOTHER ARRAY

mport java.util.Arrays;

public class ReverseArray {
    public static void reverseArrayExtraArray(int[] arr){
        int[] revArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            revArr[i]=arr[arr.length-i-1];
        }
        System.out.println("Reversed Array:");
        for(int i:revArr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4, 5};
        reverseArrayExtraArray(originalArr);
    }
}
// time complexity:O(n)

// USING FOR LOOP
public class ReverseArray {
    public static void reverseArray(int[] arr,int start,int end){  //start and end are first and last index
        int temp=0;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4, 5};
        reverseArray(originalArr,0,4);
        for(int i:originalArr){
            System.out.print(i+" ");
        }
    }
}
// time complexity: O(n)
