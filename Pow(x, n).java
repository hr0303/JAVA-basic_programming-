// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
// Example 1:
// Input: x = 2.00000, n = 10
// Output: 1024.00000
// Example 2:
// Input: x = 2.10000, n = 3
// Output: 9.26100
// Example 3:
// Input: x = 2.00000, n = -2
// Output: 0.25000
// Explanation: 2-2 = 1/22 = 1/4 = 0.25

class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }    
        long longN = n;
        if (n < 0) {
            x = 1 / x;
            longN = -longN;
        }
        double result = 1;
        double currentProduct = x;
        while (longN > 0) {
            if (longN % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
            longN /= 2;
        }
        return result;
    }
}
// Time Complexity: O(log n)
class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double result = 1;
        double currentProduct = x;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
            n /= 2;
        }
        return result;
    }
}
// Time Complexity: O(log n), does not give right ans for large test cases


class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        int m = n;
        if( n < 0) {
            m = -1*n;
        }

        for(int i = 1; i <= m; i++) {

            if( n > 0) {
                ans = ans * x;
            }
            else if( n < 0) {
                ans = ans/x;
            }
            else{
                return 1;
            }
        }
        return ans;
    }
}
// Time Complexity: O(n

// 1. How did you approach it?
//    Intial approach : iterative method but its not efficient.
//    Used "Exponentiation by Squaring": idea is to break down the exponentiation process into smaller, manageable steps by squaring the base and halving the exponent. 
//    This approach allows to compute 𝑥 ^ n in 𝑂(log 𝑛)
// 2. What challenges did you face?
//   Accomodate lage test cases; datatype n was changed from int to long
// 3. Did you reach the most optimal solution?
//   Intiality the code has time complexity of O(n), eventually it was optimised, now time complexity O(log n)
// 4. Practical aspects of this question, real world usage.
//    Interest calculation, Finance, Research
// 5. Did this question match with any existing pattern you already know?
//    Similar to divide and conquer; the idea of maikng the problem small enough to easily handle it.
