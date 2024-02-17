// REVERSING A GIVEN NUMBER
// Method 1
public class ReverseNum {
    public static void main(String[] args){
        long num=124;
        long rev=0;
        while(num!=0){
            rev=rev*10 + num%10;
            num=num/10;
        }
        System.out.println(rev);
    }

}

// Method 2
public class ReverseNum {
    public static void main(String[] args){
        long num=1240;
        System.out.println(new StringBuffer(String.valueOf(num)).reverse());
    }
}

