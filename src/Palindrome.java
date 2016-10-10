import java.util.Scanner;

public class Palindrome
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the 3 digit number or character: ");
		
		String number = input.next();

		
		if(number.charAt(0) == number.charAt(2))
		{
			System.out.println(number + " is Palindrome");
		}else
		{
			System.out.println("Invalid input");
		}
		
		
		
		input.close();
	}

}
