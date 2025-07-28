//Java program to search a sub-string in a string
import java.io.*;
public class demo3 {
 public static void main(String[] args) {
 String S = "Hello, I study in SIT";
 String subS = "study";
 int index = S.indexOf(subS);
 if (index != -1) {
 System.out.println("Substring found at index: " + index);
 } else {
 System.out.println("Substring not found");
 }
 }
}