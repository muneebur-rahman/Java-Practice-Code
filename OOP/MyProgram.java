/*
Program Name : Objects and classes Demo.
Description  : Simple Program demonstrating objects and classes in OOP in java .
Author       : Muneebur Rahman
 */
package OOP;

class Person {

    String name;
    int age;
}

public class MyProgram {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "Muneeb";
        p1.age = 19;
        p2.name = "Noman";
        p2.age = 21;
        System.out.println("Name : " + p1.name);
        System.out.println("Age : " + p1.age);
        System.out.println("Name : " + p2.name);
        System.out.println("Age : " + p2.age);
    }
}
