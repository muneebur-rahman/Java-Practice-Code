
package OOP;

class MyAccount {
    int accNo;
    double balance;

    MyAccount() {
        // default constructor
        System.out.println("in constructor");
        accNo = 98076;
        balance = 90000;
        System.out.println("Account Number = " + accNo);// in constructor
    }
}

public class MyBank {
    public static void main(String[] args) {
        System.out.println("in main class");

        MyAccount ma = new MyAccount();
        System.out.println("Balance = " + ma.balance);
    }
}