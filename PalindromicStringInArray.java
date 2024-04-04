// Given an array of strings words,
// return the first palindromic string in the array.
// If there is no such string, return an empty string "".

class Solution {
    public String firstPalindrome(String[] words) {
        String temp = "";
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            for( int j = word.length()-1; j>=0; j--){
                temp = temp.concat(String.valueOf(word.charAt(j)));
            }
            if(word.equals(temp)){
                return temp;
            }
            else{
                temp = "";
            }
        }
        return temp;
    }
}

// Time Complexity: O(n * m)  where n is the number of words in the words array, and m is the maximum length of a word in the array.
// *****************************************************************************************************

class Solution {
    public String firstPalindrome(String[] words) {
        
        for(int i = 0; i < words.length; i++){
            StringBuffer word = new StringBuffer(words[i]);
            String wordReverse = String.valueOf(word.reverse());
            if(words[i].equals(wordReverse)){
                return words[i];
            }
        }
        String emptyStr = "";
        return emptyStr;
        
    }
}
// time complexity: O(m*n)
// *****************************************************************************************************

class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }
    
    private boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
// Time complexity O(n⋅m)
