// FIND LARGEST AND SMALLEST NUMBER IN AN ARRAY


public class SmallestLargestNum {
    public static void main(String[] args) {
        int[] num={-10,11,8888,-84,6};
        int largest=num[0];
        int smallest=num[0];

        for (int i : num) {
            if (i > largest) {
                largest = i;
            } else if (i < smallest) {
                smallest = i;
            }
        }
        System.out.println("largest no.:"+largest+"\n"+"smallest no.:"+smallest);
    }

}
// TIME COMPLEXITY: O(n)
