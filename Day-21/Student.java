//package in Student Addition
package Student1;
import java.util.Scanner;

public class Student {
    String name;
    int rollNo;
    int[] marks = new int[4]; // Assuming four subjects

    // Method to set data for the student
    public void setData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student details:");
        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("Roll Number: ");
        rollNo = scanner.nextInt();

        System.out.println("Enter marks for four subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    // Method to display student information
    public void display() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Subject Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2] + ", " + marks[3]);
    }

    // Method to calculate grade based on average marks
    public void calculateGrade() {
        double average = (marks[0] + marks[1] + marks[2] + marks[3]) / 4.0;

        System.out.print("Grade: ");
        if (average >= 90 && average <= 100) {
            System.out.println("O");
        } else if (average >= 80 && average < 90) {
            System.out.println("E");
        } else if (average >= 70 && average < 80) {
            System.out.println("A");
        } else if (average >= 60 && average < 70) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
