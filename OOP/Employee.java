/*
Program Name : Employee (Classes and Objects / Method Example).
Description  : Simple Program demonstrating Classes and Objects and methods in OOP in java (Using 2  different Classes).
Author       : Muneebur Rahman
 */

package OOP;
class Base {
    int id;
    String name;
    void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
    }

}

public class Employee {
    public static void main(String[] args) {

        Base e = new Base(); // object creation
        e.id = 123;
        e.name = "Muneebur Rahman";
        e.display();
    }
}
