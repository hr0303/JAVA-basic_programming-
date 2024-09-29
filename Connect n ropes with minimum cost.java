// Given an array arr containing the lengths of the different ropes, we need to connect these ropes to form one rope. 
// The cost to connect two ropes is equal to sum of their lengths. The task is to connect the ropes with minimum cost.
//   Example1: Input: arr[] = [4, 3, 2, 6]
//             Output: 29
// Explanation: We can connect the ropes in following ways.
// 1) First connect ropes of lengths 2 and 3. Which makes the array [4, 5, 6]. Cost of operation 2 + 3 = 5. 
// 2) Now connect ropes of lengths 4 and 5. Which makes the array [9, 6]. Cost of this operation 4 + 5 = 9.
// 3) Finally connect the two ropes and all ropes have connected. Cost of this operation 9 + 6 =15
// Total cost for connecting all ropes is 5 + 9 + 15 = 29. This is the optimized cost for connecting ropes. 
// Other ways of connecting ropes would always have same or more cost. For example, if we connect 4 and 6 first (we get three rope of 3,
// 2 and 10), then connect 10 and 3 (we get two rope of 13 and 2). Finally we connect 13 and 2. Total cost in this way is 10 + 13 + 15 = 38.
  
// Example 2: Input: arr[] = [4, 2, 7, 6, 9]
//             Output: 62 
// Explanation: First, connect ropes 4 and 2, which makes the array [6, 7, 6, 9]. Cost of this operation 4 + 2 = 6. Next, add ropes 6 and 6, which results in [12, 7, 9]. 
// Cost of this operation 6 + 6 = 12. Then, add 7 and 9, which makes the array [12,16]. 
// Cost of this operation 7 + 9 = 16. And finally, add these two which gives [28].
// Hence, the total cost is 6 + 12 + 16 + 28 = 62.

// Using ArrayList
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(4);
        l.add(3);
        l.add(2);
        l.add(6);

        int sum = 0;

        while(l.size() > 1) {
            Collections.sort(l); // Sort the list in ascending order

            int n1 = l.remove(0); // Remove and get the first element
            int n2 = l.remove(0); // Remove and get the new first element

            int n3 = n1 + n2; // Store the sum of n1 and n2 in n3

            l.add(n3); // Add the result back to the list
            sum = sum + n3;
        }

        // The final element in the list will be the accumulated result
        System.out.println("Minimum Cost: " + sum);
    }
}

// Time COmplexity:  O(n^2 log n)

// Using Priority Queue
import java.util.PriorityQueue;

class HelloWorld {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(3);
        pq.add(2);
        pq.add(6);
       
        int sum = 0;
       
        // Continue until only one element is left in the priority queue
        while (pq.size() > 1) {
            // Remove the two smallest elements
            int num1 = pq.remove();
            int num2 = pq.remove();
           
            // Calculate the sum of the two smallest elements
            int num3 = num1 + num2;
           
            // Accumulate the cost
            sum += num3;
           
            // Add the sum back to the priority queue
            pq.add(num3);
        }
        
        System.out.println("Minimum Cost: " + sum);
    }    
}
// Time Complexity: O(nlogn)