// DIFFERENT WAYS TO REVERSE STRING IN JAVA
// 1.Using for loop and charAt() function.
import java.lang.String;
public class ReverseString {
    public static void main(String[] args) {
        String s1= "hello";
        String s2= "";
        int n=s1.length();
        for(int i=n-1;i>=0;i--){
            s2=s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }

}
// Using StringBuffer and reverse() function.
public class ReverseString {
    public static void main(String[] args) {
        String s1= "hello";
        StringBuffer sb=new StringBuffer(s1);
        System.out.println(sb.reverse());
    }
}

// /Printing reverese string without reversing it
public class ReverseString {
    public static void main(String[] args) {
        String s1= "hello";
        int n=s1.length();
        for(int i=n-1;i>=0;i--){
            System.out.print(s1.charAt(i));
        }
    }

}
