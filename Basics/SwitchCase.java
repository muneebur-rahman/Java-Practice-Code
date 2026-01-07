/*
Program Name : switch case example
Description  : Demonstrate the use of switch case in Java.
Author       : Muneebur Rahman
 */

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice,num1,num2;
        System.out.print("Enter First Number : ");
        num1=sc.nextInt();
        System.out.print("Enter Second Number : ");
        num2=sc.nextInt();
        
        System.out.print("Enter Your Choice \n1) Addition \n2) Subtraaction \n3) Multiplication \n4) Division \n");
        choice=sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(num1+" + "+num2+ " = "+(num1+num2));
                break;
            case 2:
                System.out.println(num1+" - "+num2+ " = "+(num1-num2));
                break;
            case 3:
                System.out.println(num1+" * "+num2+ " = "+(num1*num2));
                break;
            case 4:
                if(num2==0){
                    System.out.println("Can't divide by zero!");
                }
                System.out.println(num1+" / "+num2+ " = "+(num1/num2));
                break;

            default:

                break;
        }
        sc.close();
    }
}
