
public class RemoveSpecialChar {
    public static void main(String[] args) {
        String s="hello world!, hello universe!!";
        String s1=s.replaceAll("hello","hi");
        System.out.println(s1);

    }
}

//Remove Junk/Special Chars in a String
public class RemoveSpecialChar {
    public static void main(String[] args) {
        String s="&h&e$l$l#o#";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);

    }
}
