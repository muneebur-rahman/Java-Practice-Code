
package OOP;

//Function Example
class Cube {
    double width;
    double height;
    double depth;

    Cube(double w, double h, double d) {
        System.out.println("Constructing Cube");
        width = w;
        height = h;
        depth = d;
    }// Cube()

    // Creating function
    void calVolume() {
        System.out.println("Volume = " + width * height * depth);
    }// calVolume()

}// classs

public class MyMain {
    public static void main(String[] args) {

        Cube c = new Cube(10, 10, 10);

        // Calling function
        c.calVolume();
    }
}