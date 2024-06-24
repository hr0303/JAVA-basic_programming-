// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
// it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.
// Example 1:
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:
// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.

class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int start = 0;
        int end = s.length()-1;
        
        while(end > start){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
// Time Complexity: O(n)

// Time limit exceeded
class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        int j = 0;
        int i = 0;
        for(i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str = str + s.toLowerCase().charAt(i);
                j++;
            }
        }

        i = 0;
        j = str.length()-1;
        
        while(j>i){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
// Time Complexity: O(n)
