import java.util.Scanner;
public class Main {
    public static int binarySearch(int[] array,int numToFind){
        int low=0;
        int high=array.length-1;
        while(low<=high){
            int midPosition=(low+high)/2;
            int midNum=array[midPosition];
            if(numToFind==midNum){
                return(midPosition);
            }
            else if(numToFind<midNum){
                high=midPosition-1;
            }
            else{
                low=midPosition+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(array,9));
    }
}
