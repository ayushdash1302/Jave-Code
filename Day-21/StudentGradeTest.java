package Student2;
import Student1.*;
public class StudentGradeTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setData();
        student.display();
        student.calculateGrade();
    }
}
