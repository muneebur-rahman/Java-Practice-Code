/*
Program Name : Addition of 2 Number, take a input from user.
Description  : Demonstrate the use of Scanner Class in Java.
Author       : Muneebur Rahman
 */
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,sum;

        System.out.print("Enter First Number : ");
        num1=sc.nextInt();
 
        System.out.print("Enter Second Number : ");
        num2=sc.nextInt();
        sum=num1+num2;

        System.out.println("Addition of "+num1+" and "+num2+" = "+sum);
        sc.close();
    }//main
}//class