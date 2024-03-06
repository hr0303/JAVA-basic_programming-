// Sort an array of 0s, 1s and 2s

public class SortArray {
    public static void sortArray(int[] arr){
        int[] newArr = arr.clone(); // Create a copy of the original array
        int start = 0;
        int end = newArr.length - 1;

        for (int i = 0; i <= end; i++) {
            if (newArr[i] == 0) {
                int temp = newArr[start];
                newArr[start] = newArr[i];
                newArr[i] = temp;
                start++;
            } else if (newArr[i] == 2) {
                int temp = newArr[end];
                newArr[end] = newArr[i];
                newArr[i] = temp;
                end--;
                i--; // Decrement 'i' to recheck the swapped element.
            }
        }

        for (int x : newArr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 2, 1, 2, 0};
        sortArray(arr);
    }
}

// 2.COUNT THE NUMBER OF 0,1,& 2 ,THEN CREATE A NEW ARRAY WITH REQUITRED 0,1,2.
public class SortArray{
    public static void sortArray(int[] arr){
        int count0=0,count1=0,count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        System.out.println(count0+" "+count1+" "+count2);
        int[] newArr=new int[arr.length];
        for(int i=0;i< newArr.length;i++){   // int i = 0;
            if(count0>0){                    // while (count0 > 0) {
                newArr[i]=0;                 //     arr[i++] = 0;
                count0--;                    //     count0--;
            }                                // }
            else if(count1>0){               // while (count1 > 0) {
                newArr[i]=1;                 //    arr[i++] = 1;
                count1--;                    //    count1--;
            }                                // }
            else{                            // while (i < arr.length) {
                newArr[i]=2;                 //    arr[i++] = 2;
            }                                //}
        }
    
        System.out.println(Arrays.toString(newArr));
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 2, 1, 2, 0};
        sortArray(arr);
    }
}

