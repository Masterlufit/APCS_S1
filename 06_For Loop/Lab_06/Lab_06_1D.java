import java.util.*;

public class Lab_06_1D
{
	public static void main(String[]args)
	{
		Scanner SInput = new Scanner(System.in);
		
		System.out.println("Enter an int:");
		int Input = SInput.nextInt();
		System.out.println("Enter the Table Size:");
		int TBSize = SInput.nextInt();
		
		System.out.println("Table Starts Here..");
		
		System.out.printf("%5s || %5s","X","Y");
		System.out.printf("\n%5s || %5s","-----","-----");
		
		for(int RC=0;RC<=TBSize;RC++)
		{
			System.out.printf("\n%5d || %5d",RC,RC*Input);
		}
	}
}