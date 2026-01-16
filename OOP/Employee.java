package OOP;

class Base {
    int id;
    String name;

    void display(){
        System.out.println("Employee ID : "+id);
        System.out.println("Employee Name : "+name);
    }
    
}

public class Employee{
    public static void main(String[] args) {

        Base e=new Base(); //object creation
        e.id=123;
        e.name="Muneeb";
        e.display();
    }
}
