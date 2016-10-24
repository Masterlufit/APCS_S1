import java.util.*;

public class Lab_06_1A
{
	public static void main(String[]args)
	{
		Scanner SInput = new Scanner(System.in);
		
		System.out.println("Enter the number you want to count up to:");
		int Max = SInput.nextInt();
		System.out.println("Enter the number you want to count by:");
		int By = SInput.nextInt();
		
		System.out.println("\n\n\n\n\nCounting...");
		for(int RC=0; RC<=Max;RC=RC+By)
		{
			System.out.println(RC);
		}
	}
}