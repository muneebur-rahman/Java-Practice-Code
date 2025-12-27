/*
Program Name : For Loop to print even numbers.
Description  : Demonstrate the use of for Loop in java.
Author       : Muneebur Rahman
 */
public class ForLoop {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Even Numbers fom 1 to 10 : ");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } // if
        } // for
    }// main
}// class
