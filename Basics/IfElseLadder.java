/*
Program Name : Find Largest of 3 number using If Else Ladder
Description  : Demonstrate the use of if-else ladder in Java.
Author       : Muneebur Rahman
 */

public class IfElseLadder {
    public static void main(String[] args) {
        int a = 20, b = 50, c = 10;

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is Largest");
            }else{
                System.out.println(c+" is LArgest");
            }
        }//if
        else if(b>a){
            System.out.println(b+" is Largest");
        }else{
            System.out.println(c+" is LArgest");
        }//else if
    }//main
}//calss
