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
