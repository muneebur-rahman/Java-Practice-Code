/*
Program Name : Classes and Objects Example.
Description  : Simple Program demonstrating classes and Objects in OOP in java .
Author       : Muneebur Rahman
 */

package OOP;

class Demo {
    int x = 10;

    int display() {
        System.out.println("x = " + x);
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Demo D1 = new Demo();

        System.out.println(D1); // print garbage value

        System.out.println(D1.display());
    }
}