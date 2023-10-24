//Write a Java program to reverse an array from desired index


public class ReverseArrayFromGivenIndex {
    static int[] reverseArray(int[] arr,int n,int a) {
        int[] ans = new int[n];
        for (int i = 0; i < a; i++) {
            ans[i] = arr[i];
        }
        int j=n-1;
        for (int i = a; i < n; i++) {
            ans[i] = arr[j];
            j--;
        }
        return ans;
    }
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        printArray((reverseArray(arr,8,2)));
    }

}
