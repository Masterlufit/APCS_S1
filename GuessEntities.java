import java.util.Scanner;

public class GuessEntities
{
	public static void main(String[]args)
	{
		Scanner STrueFalse = new Scanner(System.in);
		
		System.out.println("True or False?");
		String ToF = STrueFalse.next();
		
		if (ToF.equals("True"))
		{
			System.out.println("You entered: True");
		}
		
		if (ToF.equals("False"))
		{
			System.out.println("You entered: False");
		}
		
		if (!ToF.equals("True"))
		{
			System.out.println("You did not enter: True");
		}
		
		if (!ToF.equals("False"))
		{
			System.out.println("You did not enter: False");
		}
		
	}
	
	
}

