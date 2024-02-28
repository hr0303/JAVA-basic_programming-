// FIND MINIMUM AND MAXIMUM ELEMENT IN AN ARRAY
// 1.Sort the array and print first and last element
import java.util.Arrays;
public class SmallestLargestNumber {
  public static void MaxMin(int[] arr){
        Arrays.sort(arr);
        System.out.println("Smallest Number:"+arr[0]);
        System.out.println("Largest Number:"+arr[arr.length-1]);
    }

    public static void main(String[] args) {
        int[] arr={-1,-20,3,499,5};
        MaxMin(arr);
    }
}


//2.Compare each element using for loop
mport java.util.Arrays;
public class SmallestLargestNumber {
    public static void SmallestLargestNum(int[] arr){
        int min=arr[0];
        int max=arr[0];
        for(int i:arr){
            if(i<min) {
                min=i;
            }
            else if (i>max) {
                max=i;
            }
        }
        System.out.println("Smallest Number:"+min);
        System.out.println("Largest Number:"+max);
    }
    public static void main(String[] args) {
        int[] arr={-1,-20,3,499,5};
        SmallestLargestNum(arr);
    }
}


