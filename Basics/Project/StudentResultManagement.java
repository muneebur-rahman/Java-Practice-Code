/* 
Program Name : Student Result Management System
Description  : Demonstrate the use of Basic concepts like data-types, conditional statement, ,loops, and user input.
Author       : Muneebur Rahman
 */
package Project;

import java.util.Scanner;

public class StudentResultManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, subject, total_max_marks;
        float marks, total_marks_obtained = 0, percentage;
        String name, rollNo, subjectName;
        boolean isPass = true;

        System.out.print("Enter Name of Student \t\t: ");
        name = sc.nextLine();

        System.out.print("Enter " + name + "'s Roll Number \t: ");
        rollNo = sc.nextLine();

        System.out.print("Enter Number of Subjects \t: ");
        subject = sc.nextInt();

        // System.out.print("Enter Total Max Marks : ");
        // total_max_marks = sc.nextInt();
        total_max_marks = subject * 100;
        sc.nextLine();

        for (i = 0; i < subject; i++) {
            System.out.print("Enter subject Name " + (i + 1) + " \t\t: ");
            subjectName = sc.nextLine();

            System.out.print("Enter " + subjectName + " Marks \t\t: ");
            marks = sc.nextFloat();
            sc.nextLine();
            total_marks_obtained += marks;

            if (total_marks_obtained < 35) {
                isPass = false;
            }
        }

        percentage = (total_marks_obtained / total_max_marks) * 100;

        System.out.println("---------- Student Result ----------");
        System.out.println("Name \t\t\t: " + name);
        System.out.println("Roll Number \t\t: " + rollNo);
        System.out.println("Total Max Marks \t: " + total_max_marks);
        System.out.println("Total Marks Obtained \t: " + total_marks_obtained);
        System.out.println("Percentage \t\t: " + percentage);

        if (percentage < 35) {

        }

        if (isPass) {

        }
        sc.close();
    }
}
