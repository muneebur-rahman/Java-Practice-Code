/*
Program Name : If-Else If-Else
Description  : Demonstrate the use of if-else if-else conditional statements in Java.
Author       : Muneebur Rahman
 */

public class IfElseIf {
    public static void main(String[] args) {
        int GradePoints = 9;

        if (GradePoints == 10) {
            System.out.println("Letter Grade : O");
        } else if (GradePoints == 9) {
            System.out.println("Letter Grade : A+");
        } else if (GradePoints == 8) {
            System.out.println("Letter Grade : A");
        } else if (GradePoints == 7) {
            System.out.println("Letter Grade : B+");
        } else if (GradePoints == 6) {
            System.out.println("Letter Grade : B");
        } else if (GradePoints == 5) {
            System.out.println("Letter Grade : C");
        } else if (GradePoints == 4) {
            System.out.println("Letter Grade : P");
        } else {
            System.out.println("Letter Grade : F");
        } // else
    }// main
}// class
