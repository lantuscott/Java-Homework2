import java.util.Scanner;
public class BoolEval
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first string: true or false? ");
		
		String a = input.next();
		
		System.out.print("Enter second string: true or false? ");
		
		String b = input.next();
		
		boolean boolA, boolB;
		
		if(a.equals("true"))
		{
			boolA = true;
		}else
		{
			boolA = false;
		}
		
		if(b.equals("true"))
		{
			boolB = true;
		}else
		{
			boolB = false;
		}
		
		if(boolA == true)
		{
			System.out.println("boolA == true");
		}

		if(boolB == false)
		{
			System.out.println("boolB == false");
		}

		if(boolA && boolB == false)
		{
			System.out.println("boolA and boolB == false");
		}

		if(boolA || boolB == true)
		{
			System.out.println("boolA or boolB == true");
		}
 
		if(boolA != false)
		{
			System.out.println("not boolA == false");
		}

		if(boolB != true)
		{
			System.out.println("not boolB == true");
		}		
		
		input.close();
	}

}
