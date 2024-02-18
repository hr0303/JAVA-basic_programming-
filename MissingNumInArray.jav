// FIND THE MISSING NUMBER IN AN ARRAY OF INTEGERS

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7};
        int n = arr.length + 1; // Expected count of numbers (including the missing one)
        int expectedSum = n * (n + 1) / 2; // Sum of numbers from 1 to n
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num; // Calculate the actual sum of numbers in the array
        }

        int missingNum = expectedSum - actualSum; // Calculate the missing number
        System.out.println("Missing number is: " + missingNum);
    }
}

