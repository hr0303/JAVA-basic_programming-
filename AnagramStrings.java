// TO CHECK WHETHER THE GIVEN STRINGS ARE ANAGRAM OR NOT

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        String str1="abc";
        String str2="cba";
        String str3="aab";
        System.out.println(isAnagram(str1,str2));
        System.out.println(isAnagram(str1,str3));
    }

    public static boolean  isAnagram(String s1,String s2){
        boolean value=false;
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            value=true;
        }
        return value;
    }
}
