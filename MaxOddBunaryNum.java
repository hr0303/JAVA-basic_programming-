// You are given a binary string s that contains at least one '1'.
// You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number that can be created from this combination.
// Return a string representing the maximum odd binary number that can be created from the given combination.
// Note: that the resulting string can have leading zeros.

class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder maxOddBinaryNum = new StringBuilder();
        int count = 0;
        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count += 1;
            }
        }
        for(int i = 1; i < count; i++){
            maxOddBinaryNum.append(1);
        }
        
        for(int i = count; i < s.length(); i++){
            maxOddBinaryNum.append(0);
         }
        
        maxOddBinaryNum.append(1);

        return maxOddBinaryNum.toString();
    }    
}

// Time Complexity : O(n)
