// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
// Example 1:
// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:
// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.

class Solution {
    public int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index;
    }
}

// Time Complexity: O(n*m)

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0; // handle the edge case for an empty needle

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            int j;
            for (j = 0; j < needleLength; j++) {
                // Compare the characters of haystack and needle
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break; // Characters do not match, exit the inner loop
                }
            }
            if (j == needleLength) {
                return i; // Found the needle, return the starting index
            }
        }

        return -1; // Needle not found in haystack
    }
}
// Time Complexity: O(n*m)
