import java.util.Scanner;
 
public class javaexcercise {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
 
  System.out.print("Input 1st number: ");
  int num1 = in.nextInt();
 
  System.out.print("Input 2nd number: ");
  int num2 = in.nextInt();
 
 
  System.out.println("Addition of two numbers: " + num1 + " + " + num2 + " = " + 
  (num1 + num2));
 
  System.out.println("subtraction of two numbers: " +num1 + " - " + num2 + " = " + 
  (num1 - num2));
 
  System.out.println("Multiplication of two numbers: "+ num1 + " x " + num2 + " = " + 
  (num1 * num2));
 
  System.out.println("Division of two numbers: " + num1 + " / " + num2 + " = " + 
  (num1 / num2));
 
  System.out.println("Remainder of two numbers: "+ num1 + " mod " + num2 + " = " + 
  (num1 % num2));
 }
 
}