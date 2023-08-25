/* Write a program which creates a class "Student" with the following
Data Members
rollNum, studName, mark1, mark2, mark3, total Marks
Methods
setStudDetails() - which sets the values to all the data members except totalMarks.
calculate Total() - which calculate the total Marks
displayStudDetails() - which displays rollNum, studName and total Marks8*/

class Student {
    int rollNum;
    String name;
    int m1, m2, m3, totalMarks;

//    public void setDetails(int rollNum, String name, int m1, int m2, int m3) {
      Student(int rollNum, String name, int m1, int m2, int m3) {
        this.rollNum = rollNum;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void calculateTotal() {
        int totalMarks = m1 + m2 + m3;
        this.totalMarks = totalMarks;
    }

    public void displayDetails() {
        System.out.println(rollNum + "    " + name + "    " + totalMarks);
    }

}
public class StudentDemo{
    public static void main(String [] args){
        Student s1 = new Student(1,"Himanshi",10,10,10);
//        s1.setDetails(1,"Himanshi",10,10,10);
        s1.calculateTotal();
        s1.displayDetails();

        Student s2 = new Student(2,"Aparna",20,20,20);
//        s2.setDetails(2,"Aparna",20,20,20);
        s2.calculateTotal();
        s2.displayDetails();
    }


}
