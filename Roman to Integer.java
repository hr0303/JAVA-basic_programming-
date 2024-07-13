// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two ones added together. 
// 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
// Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
// The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.
// Example 1:
// Input: s = "III"
// Output: 3
// Explanation: III = 3.
// Example 2:
// Input: s = "LVIII"
// Output: 58
// Explanation: L = 50, V= 5, III = 3.
// Example 3:
// Input: s = "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

class Solution {
    public int romanToInt(String s) {
        char[] list = s.toCharArray();
        int val = 0;

        for (int i = 0; i < list.length; i++) {

            if (i+1 < list.length){
                if (list[i+1] == 'V' && list[i] == 'I'){
                    val+=4;
                    i++;
                    continue;
                }
                else if (list[i+1] == 'X' && list[i] == 'I'){
                    val+=9;
                    i++;
                    continue;
                }
                else if (list[i+1] == 'L' && list[i] == 'X'){
                    val+=40;
                    i++;
                    continue;
                }
                else if (list[i+1] == 'C' && list[i] == 'X'){
                    val+=90;
                    i++;
                    continue;
                }
                else if (list[i+1] == 'D' && list[i] == 'C'){
                    val+=400;
                    i++;
                    continue;
                }
                else if (list[i+1] == 'M' && list[i] == 'C'){
                    val+=900;
                    i++;
                    continue;
                }
            }

            if (list[i] == 'I') {
                val += 1;
            } else if (list[i] == 'V') {
                val += 5;
            } else if (list[i] == 'X') {
                val += 10;
            } else if (list[i] == 'L') {
                val += 50;
            } else if (list[i] == 'C') {
                val += 100;
            } else if (list[i] == 'D') {
                val += 500;
            } else if (list[i] == 'M') {
                val += 1000;
            }
        }
        return val;
    }
}

// Time Complexity: O(n)

// 1. How did you approach it?
//   Roman number is given as a string, to associate these letters to repective values convert them into a character array.
//   Iterate through array and assign numeric value to respective character.
//   Roman number system does not repeat any symbol more than 3 times,eg. 4 is written as IV and not IIII. Use a for loop to compare consecutive elements 
//   and assign correct values to such representations.
  
// 2. What challenges did you face?
//   Listing numbers where the representation is in subtraction format.
//   Convertinf string to array(forgot syntax)
  
// 3. Did you reach the most optimal solution?
//   In terms of time complexity, Yes.
  
// 4. Practical aspects of this question, real world usage.
//   Converting certain representation into decimal numbers.
  
// 5. Did this question match with any existing pattern you already know?
//   Itration is similar to many questions which involve comparision.

