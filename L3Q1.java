
import java.util.*;
public class L3Q1 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter student details");
    System.out.print("enter student name for demonstrating next function: ");
    String empName = sc.next(); // function next
    System.out.println("enter age for demonstrating nextByte function: ");
    byte age = sc.nextByte(); // nextByte function
    System.out.println("enter roll no. for demonstrating nextShort function: ");
    short r = sc.nextShort();// nextShort function
    System.out.print("enter admission number for demonstrating nextInt function: ");
    int adm = sc.nextInt();// nextInt function
    System.out.println("enter phone number for demonstrating nextLong function: ");
    long ph = sc.nextLong();// nextLong function
    System.out.println("enter marks for demonstrating nextFloat function: ");
    float m = sc.nextFloat();// nextFloat function
    System.out.print("enter average for demonstrating nextDouble function: ");
    double avg = sc.nextDouble();// nextDouble function
    System.out.print("enter true for demonstrating nextBoolena function: ");
    boolean bn = sc.nextBoolean();// nextBoolena function
    System.out.println("student Details");
    System.out.print("student name is: " + empName);
    System.out.println("student age: " + age);
    System.out.println("student roll no.: " + r);
    System.out.println("student admission number: " + adm);
    System.out.println("student phone number: " + ph);
    System.out.println("student marks: " + m);
    System.out.println("student avg marks: " + avg);
    System.out.println("student details is: " + bn); }
}

