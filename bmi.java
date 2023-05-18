import java.util.Scanner;
public class bmi {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input weight in kg: ");
        double weight = input.nextDouble();

        System.out.print("Input height in meters: ");
        double meters = input.nextDouble();

        double BMI = weight/ (meters*meters);
        System.out.print("Body Mass Index is " + BMI+"\n");
    }
}
