import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        System.out.print("enter the number :: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}