
import java.util.Scanner;

// package Assignment;

// Define a class employee with the following specification:
//  Members are: empno of type integer, ename of type String, basic, hr and da
// are of type float, netpay of type float.
//  Member functions:
//  Calculate() : A function to find basix+hra+da with the float return type.
//  havedata(): function to accept values for empno, ename, basic, hra, da and
// invoke calculate() to calculate netpay.
//  dispdata(): function to display all the data members.
// import java.lang.reflect.Member;


class Employee{
    int empNo;
    String eName;
    float basic,hr,da;

    float calculate(){
        return basic+hr+da;
    }

    void haveData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Number: ");
        empNo=sc.nextInt();
        System.out.println("Enter Employee Name: ");
        eName=sc.next();
        System.out.println("Enter Employee Basic: ");
        basic=sc.nextFloat();
        System.out.println("Enter Employee Hr: ");
        hr=sc.nextFloat();
        System.out.println("Enter Employee Da: ");
        da=sc.nextFloat();
        calculate();
        sc.close();
    }
}

public class Fifth_5 {
    
}
