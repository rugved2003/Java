import java.util.Scanner;
public class L2Q2 {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

		float timeSeconds;
		float mps,kph, mph;

		System.out.print("Enter distance in meters: ");
		float distance = scanner.nextFloat();

		System.out.print("hour: ");
		float hr = scanner.nextFloat();

		System.out.print("minutes: ");
		float min = scanner.nextFloat();

		System.out.print("seconds: ");
		float sec = scanner.nextFloat();

		timeSeconds = (hr*3600) + (min*60) + sec;
		mps = distance / timeSeconds;
		kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
		mph = kph / 1.609f;

		System.out.println("Speed in meters/second is "+mps);
		System.out.println("Speed in km/h is "+kph);
		System.out.println("Speed in miles/h is "+mph);
		

		scanner.close();
	}
}
