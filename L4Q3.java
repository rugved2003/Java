import java.util.Scanner;
public class L4Q3 {
    public static void main(String[] args) {
    int num1 = (int)(System.currentTimeMillis() % 10);
    int num2 = (int)(System.currentTimeMillis() / 7 % 10);
    // Create a Scanner
    Scanner input = new Scanner(System.in);
  
    System.out.print("What is " + num1 + " + " + num2 + "? ");
    int answer = input.nextInt();
    while((num1 + num2) != answer)
    {
        System.out.print("Wrong answer.try again. what is" 
         + num1 + " + "+ num2 + "? ");
        answer = input.nextInt();
    }
    System.out.println("Now,correct; You have learned the lesson ");
    }
}
