// Given two arrays arr1[] and arr2[] of size n and m respectively. 
// The task is to find the number of elements in the union between these two arrays.

public class ArrayUnion {
   public static void arrayUnion(int[]arr1,int[] arr2){
       int count=arr1.length+arr2.length;
       for(int i=0;i<arr1.length;i++){
           for(int j=0;j<arr2.length;j++){
               if(arr1[i]==arr2[j]){
                   count--;
               }
           }
       }
       System.out.println(count);
   }
  public static void main(String[] args) {
        int[] arr1={1,2,3, 4, 5};
        int[] arr2={1,2,3};
        arrayUnion(arr1,arr2);
    }
}
// Time Complexity: O(n^2)


//2. USING HASHSET: STORES UNIQUE VALUES
import java.util.HashSet;
public static void arrayUnion(int[] arr1,int[] arr2){
        HashSet<Integer> union = new HashSet<>();
        for(int element:arr1){
            union.add(element);
        }
        for(int element:arr2){
            union.add(element);
        }
        System.out.println(union.size());
        System.out.println(union);
    }
//    Time Complexity: O(m+n)

    public static void main(String[] args) {
        int[] arr1={1,2,3, 4, 5};
        int[] arr2={1,2,3};
        arrayUnion(arr1,arr2);
    }
}


