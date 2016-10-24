import java.util.*;

public class Lab_06_1C
{
	public static void main(String[]args)
	{
		Scanner SInput = new Scanner(System.in);
		
		System.out.println("Enter a Word:");
		String Input = SInput.next();
		
		for(int RC=Input.length(); RC>0;RC--)
		{
			System.out.println(Input.substring(RC,Input.length()));
		}
	}
}