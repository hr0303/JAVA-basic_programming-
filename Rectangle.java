/*Write a program to create a class Rectangle with datamembers length and breadth.
Create a method area() which finds the area of the rectangle. Use constructors to assign.
Write a program to find the number of instances created for a given class.*/

class Rectangle {
    int l;
    int b;
    static int count;

    Rectangle(int l,int b){
        this.l = l;
        this.b = b;
        count = count+1;
    }

    public void area(){
        int area = l*b;
        System.out.println("Area = "+area);
    }
    public static void main(String [] args){
        Rectangle r1 = new Rectangle(3,5);
        r1.area();
        System.out.println("no of instances created = "+count);
    }

}
