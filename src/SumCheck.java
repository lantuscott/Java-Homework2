import java.util.Scanner;

public class SumCheck
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = input.nextInt();
		System.out.print("Enter first second: ");
		int b = input.nextInt();
		System.out.print("Enter first third: ");
		int c = input.nextInt();
		
		int resultA = a+b;
		int resultB = b+c;
		int resultC = c+a;
		
		if( resultA == c || resultB == a || resultC == b)
		{
			System.out.println("Yes!");
		}else 
		{	
			System.out.println("No");
		}

		input.close();
	}

}
