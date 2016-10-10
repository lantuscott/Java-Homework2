import java.util.Scanner;

public class Driving
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Driving Distance ");
		
		double distance = input.nextDouble();
		
		System.out.print("Enter Miles per Galon ");
		
		double mpg = input.nextDouble();
		
		System.out.print("Enter Price per Galon ");

		double ppg = input.nextDouble();
		
		double result = ((distance * ppg) / mpg);

		System.out.println("The cost of driving is -> " + result);
		
		input.close();
	}

}
