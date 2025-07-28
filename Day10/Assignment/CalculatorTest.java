/*q3.3.	Define a class Calculator with the following methods:
A static method called powerInt(int num1, int num2), 
This method should return num1 to the power num2. 
A static method called powerDouble(double num1, int num2). 
This method should return num1 to the power num2. 
Invoke both the methods and test the functionalities. 
Hint: Use Math.pow(double,double) to calculate the power.*/

class Calculator {
    // Static method to calculate power for integer values
    public static void powerInt(int num1, int num2) {
        int result = (int) Math.pow(num1, num2);
        System.out.println(num1 + " to the power " + num2 + " (int): " + result);
    }

    // Static method to calculate power for double values
    public static void powerDouble(double num1, int num2) {
        double result = Math.pow(num1, num2);
        System.out.println(num1 + " to the power " + num2 + " (double): " + result);
    }
}

public class CalculatorTest {
    public static void main(String[] args) {
        // Test powerInt method
        Calculator.powerInt(2, 3);

        // Test powerDouble method
        Calculator.powerDouble(2.5, 2);
    }
}
