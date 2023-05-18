import java.util.Random;
import java.util.Scanner;

public class L3Q5{
	public static void main(String[] args)
	{
		int number, lottery;
		Scanner sc = new Scanner(System.in);

		Random rand = new Random();
		lottery = rand.nextInt(100);

	     System.out.print("Enter your lottery pick (two digits) => ");
		number = sc.nextInt();

		if(lottery == number)
		{
			System.out.println("Exact match: you win RS.25,000");
		}
		else
		{	
			int d1, d2, l1, l2;
			d1 = number % 10;
			number = number / 10;
			d2 = number % 10;
	
			l1 = lottery % 10;
			lottery = lottery / 10;
			l2 = lottery % 10;
				
			int cnt = 0;
			if(d1 == l1 || d1 == l2)
				cnt++;
			if(d2 == l1 || d2 == l2)
				cnt++;

		if(cnt == 0)
		System.out.println("Sorry: no match");
		else if(cnt == 1)
		System.out.println("Match one digit: you win Rs.5,000");
		else if(cnt == 2)
		System.out.println("Match all digits: you win Rs.15,000");
		}	
	
	}
}		