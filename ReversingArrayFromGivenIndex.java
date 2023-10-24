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


//another code
import java.util.Scanner;

public class Main {

    static int[] reverseArray(int[] arr,int n,int a) {
        int b = n-1;
        while(a!=b){
            int temp =arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
        return arr;
    }
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter index value from where array is to be reversed");
        int a=sc.nextInt();
        printArray((reverseArray(arr,n,a)));
    }

}
