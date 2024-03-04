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
