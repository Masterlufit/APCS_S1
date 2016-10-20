import java.util.*;

public class Lab_06_1B
{
	public static void main(String[]args)
	{
		Scanner SInput = new Scanner(System.in);
		
		System.out.println("Enter an int:");
		int Input = SInput.nextInt();
		
		for(int RC=Input-1;RC>=1;RC--)
		{
			Input = Input*RC;
		}
		System.out.println(Input);
	}
}