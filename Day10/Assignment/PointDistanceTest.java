/*q1.Design a class Point with data members as xCo, yCo. 
The class should have a parameterized constructor to initialize its data members.  
Define a method distanceBetPoints() which will take 2 point class objects and 
return the distance between two points. Define a driver class and test the functionalities.*/

import java.util.Scanner;

class Point {
    double xCo;
    double yCo;

    Point(double xCo1, double yCo1) {
        xCo = xCo1;
        yCo = yCo1;
    }

    double distanceBetweenPoints(Point otherPoint) {
        double xDiff = xCo - otherPoint.xCo;
        double yDiff = yCo - otherPoint.yCo;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}

public class PointDistanceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for the first point:");
        System.out.print("Enter x-coordinate: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y-coordinate: ");
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates for the second point:");
        System.out.print("Enter x-coordinate: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y-coordinate: ");
        double y2 = scanner.nextDouble();

        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);

        double distance = point1.distanceBetweenPoints(point2);
        System.out.println("Distance between the points: " + distance);
    }
}
