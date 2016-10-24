import java.util.*;

public class Lab_06_1A
{
	public static void main(String[]args)
	{
		Scanner SInput = new Scanner(System.in);
		
		System.out.println("Enter a Word:");
		String Input = SInput.next();
		
		for(int RC=0; RC<Input.length();RC++)
		{
			System.out.println(Input);
		}
	}
}