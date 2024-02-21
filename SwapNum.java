// SWAP 2 INTEGER NUMBERS WITHOUT USING A TEMPORARY VARIABLE

ublic class SwapNum {
    public static void main(String[] args) {
        int x=10;
        int y=5;
        System.out.println(x+" "+y);
//        USING OPERATORS- +,-
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x+" "+y);

//        USING OPERATORS- *,/
        x=x*y;
        y=x/y;
        x=x/y;
        System.out.println(x+" "+y);

//        USING XOR OPERATOR
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println(x+" "+y);
    }
}
