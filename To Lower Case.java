// Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
// Example 1:
// Input: s = "Hello"
// Output: "hello"
// Example 2:
// Input: s = "here"
// Output: "here"
// Example 3:
// Input: s = "LOVELY"
// Output: "lovely"

class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}

// Time Complexity : O(n)

class Solution {
    public String toLowerCase(String s) {
        StringBuilder s1 = new StringBuilder();
        for(int i = 0; i< s.length(); i++ ) {
            if( s.charAt(i) == 'A') {
                s1.append('a');
                continue;
            }
            if( s.charAt(i) == 'B') {
                s1.append('b');
                continue;
            }
            if( s.charAt(i) == 'C') {
                s1.append('c');
                continue;
            }
            if( s.charAt(i) == 'D') {
                s1.append('d');
                continue;
            }
            if( s.charAt(i) == 'E') {
                s1.append('e');
                continue;
            }
            if( s.charAt(i) == 'F') {
                s1.append('f');
                continue;
            }
            if( s.charAt(i) == 'G') {
                s1.append('g');
                continue;
            }
            if( s.charAt(i) == 'H') {
                s1.append('h');
                continue;
            }
            if( s.charAt(i) == 'I') {
                s1.append('i');
                continue;
            }
            if( s.charAt(i) == 'J') {
                s1.append('j');
                continue;
            }
            if( s.charAt(i) == 'K') {
                s1.append('k');
                continue;
            }
            if( s.charAt(i) == 'L') {
                s1.append('l');
                continue;
            }
            if( s.charAt(i) == 'M') {
                s1.append('m');
                continue;
            }
            if( s.charAt(i) == 'N') {
                s1.append('n');
                continue;
            }
            if( s.charAt(i) == 'O') {
                s1.append('o');
                continue;
            }
            if( s.charAt(i) == 'P') {
                s1.append('p');
                continue;
            }
            if( s.charAt(i) == 'Q') {
                s1.append('q');
                continue;
            }
            if( s.charAt(i) == 'R') {
                s1.append('r');
                continue;
            }
            if( s.charAt(i) == 'S') {
                s1.append('s');
                continue;
            }
            if( s.charAt(i) == 'T') {
                s1.append('t');
                continue;
            }
            if( s.charAt(i) == 'U') {
                s1.append('u');
                continue;
            }
            if( s.charAt(i) == 'V') {
                s1.append('v');
                continue;
            }
            if( s.charAt(i) == 'W') {
                s1.append('w');
                continue;
            }
            if( s.charAt(i) == 'X') {
                s1.append('x');
                continue;
            }
            if( s.charAt(i) == 'Y') {
                s1.append('y');
                continue;
            }
            if( s.charAt(i) == 'Z') {
                s1.append('z');
                continue;
            }
            else {
                s1.append(s.charAt(i));
            }
        }
        return s1.toString();
    }
}
// Time Complexity : O(n)
