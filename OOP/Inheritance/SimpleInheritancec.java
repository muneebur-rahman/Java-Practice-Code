package OOP.Inheritance;

class A{
    int i,j;
    void showij(){
        System.out.println("i and j: "+i+" "+j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("k: "+k);
    }
    void sum(){
        System.out.println("i+j+k: "+(i+j+k));
    }
}
public class SimpleInheritancec {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();

        a.i=10;
        a.j=20;
        System.out.println("Contents of Super object (A)");
        a.showij();
        System.out.println();
        
        b.i=7;
        b.j=8;
        b.k=9;
        System.out.println("Contents of sub object (B)");
        b.showij();
        b.showk();
        System.out.println();
        System.out.println("Sum of i j and k is: ");
        b.sum();

    }
}
