import java.util.Scanner;

public class Drinking
{

	public static void main(String[] args)
	{
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your day of birth:");
		
		int day = input.nextInt();
		
		System.out.println("Please enter your month of birth:");
		
		int month = input.nextInt();
		
		System.out.println("Please enter your year of birth:");
		
		int year = input.nextInt();

		if(2016 - year == 21)
		{
			if(9 - month >= 0)
			{
				if(7 - day >= 0)
				{
					System.out.println("Can Drink!");
				}else
				{
					System.out.println("Can't Drink");
				}
			}else
			{
				System.out.println("Can't Drink");
			}
		}else
		{
			System.out.println("Can't Drink");
		}
		
		
		input.close();
	}

}
