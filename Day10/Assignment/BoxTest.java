/*q2.Define a class Box that uses a parameterized constructor to initialize 
the dimensions of a Box,  
having the data members width, height and depth. 
The class should a method which can return the volume of the Box. 
Create an object of the Box class and test the functionalities.*/

import java.util.Scanner;

class Box {
    double width;
    double height;
    double depth;

    // Parameterized constructor
    public Box(double width1, double height1, double depth1) {
        width = width1;
        height = height1;
        depth = depth1;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return width * height * depth;
    }
}

public class   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Box dimensions
        System.out.println("Enter dimensions for the Box:");
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter depth: ");
        double depth = scanner.nextDouble();

        // Creating a Box object
        Box myBox = new Box(width, height, depth);

        // Calculating and displaying the volume of the Box
        double volume = myBox.calculateVolume();
        System.out.println("Volume of the Box: " + volume);
    }
}
